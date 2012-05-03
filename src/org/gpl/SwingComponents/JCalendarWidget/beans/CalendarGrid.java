package org.gpl.SwingComponents.JCalendarWidget.beans;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.Border;
import org.gpl.SwingComponents.JCalendarWidget.NumberFormatter;

/**
 *
 * @author Naveed
 * 
 */
public class CalendarGrid extends JPanel {

    private JSeparator separator;

    public enum WeekdayStyle {

        FULLNAME,
        SHORTNAME,
        FIRSTCHAR;
    }
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    //<editor-fold desc="Varaible Declaration">
    //private final int BUTTON_WIDTH = 26;
    //private final int BUTTON_HEIGHT = 20;
    private Date today;
    private DateButton[] dayBtns;
    private DateButton[] weekBtns;
    private DateButton fillerBtn;
    private DateButton[] weekDayBtns;
    private JPanel calendarPanel;
    private JPanel daysPanel;
    private JPanel weekDayPanel;
    private JPanel weekNumberContainer;
    private JPanel filler;
    private Calendar calendar;
    private boolean datesFromPreviousAndNextMonthShown;
    private boolean weekNumberVisible;
    private Locale locale;
    private ArrayList<Date> selectedDays;
    private Date minSelectableDate;
    private Date maxSelectableDate;
    private Color selectedBackground;
    private Color selectedForeground;
    private Border selectedBorder;
    private Color todayBackground;
    private Border todayBorder;
    private Color rolloverForeground;
    private Color holidayForeground;
    private int holiday = 1;//SUNDAY
    private Color todayForeground;
    private Color disabledDayForeground;
    private Color weekBackground;
    private Color weekForeground;
    private boolean highlightHolidays;
    private boolean componentInitialized = false;
    private WeekdayStyle weekdayStyle = WeekdayStyle.SHORTNAME;
    private Dimension weekDayPanleSize;
    private Dimension weekNumberPanelSize;
    private NumberFormatter numberFormatter;
    private Color rolloverGradient1;
    private Color rolloverGradient2;
    private Color rolloverBorderColor;
    private int rolloverGradientAlpha1;
    private int rolloverGradientAlpha2;
    private boolean multipleDateSelectionAllowed;
//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor Code">
    public CalendarGrid(Locale locale) {
        this.locale = locale;

        initComponent();
    }

    public CalendarGrid() {
        this(Locale.getDefault());
    }
// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Init Code">
    private void initComponent() {
        selectedDays = new ArrayList<Date>();
        removeAll();
        //default values
        weekNumberPanelSize = new Dimension(30, 20);
        weekDayPanleSize = new Dimension(20, 20);
        setLayout(new BorderLayout(0, 0));
        weekDayBtns = new DateButton[7];
        dayBtns = new DateButton[42];
        initCalendarPanel();
        weekBtns = new DateButton[6];
        initWeeksPanel();
        calendar = Calendar.getInstance(locale);
        paintCalendar();
        add(calendarPanel, BorderLayout.CENTER);
        if (weekNumberVisible) {
            add(weekNumberContainer, BorderLayout.LINE_START);
        }
        setOpaque(false);
        componentInitialized = true;
    }

    private void initWeekDayPanel() {
        weekDayPanel = new JPanel();
        weekDayPanel.setOpaque(false);
        GridLayout layout = new GridLayout(1, 7, 0, 0);
        weekDayPanel.setLayout(layout);
        for (int i = 0; i < 7; i++) {
            weekDayBtns[i] = new DateButton(false);
            weekDayBtns[i].setRolloverEnabled(false);
            weekDayPanel.add(weekDayBtns[i]);
            initButton(weekDayBtns[i]);
        }
        weekDayPanel.setBackground(weekBackground);
    }

    private void initCalendarPanel() {
        calendarPanel = new JPanel(new BorderLayout(0, 0));
        calendarPanel.setOpaque(false);
        initWeekDayPanel();
        initDaysPanel();
        calendarPanel.add(weekDayPanel, BorderLayout.PAGE_START);
        calendarPanel.add(daysPanel, BorderLayout.CENTER);

    }

    private void paintCalendar() {
        weekNumberContainer.setBackground(weekBackground);
        weekNumberContainer.setPreferredSize(weekNumberPanelSize);
        weekDayPanel.setPreferredSize(weekDayPanleSize);
        filler.setPreferredSize(new Dimension(weekNumberContainer.getPreferredSize().width,
                weekDayPanel.getPreferredSize().height));
        weekDayPanel.setBackground(weekBackground);
        daysPanel.setBackground(getBackground());
        Calendar tmpCal = (Calendar) calendar.clone();
        if (minSelectableDate == null) {
            tmpCal.set(1, 0, 1, 1, 1);
            minSelectableDate = tmpCal.getTime();
        }
        if (maxSelectableDate == null) {
            tmpCal.set(9999, 0, 1, 1, 1);
            maxSelectableDate = tmpCal.getTime();
        }
        paintDayNames();
        paintDays();
    }

    private void initDaysPanel() {
        daysPanel = new JPanel();
        daysPanel.setOpaque(false);
        GridLayout layout = new GridLayout(6, 7, 0, 0);
        daysPanel.setLayout(layout);
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 7; x++) {
                int index = x + (7 * y);
                dayBtns[index] = new DateButton(true);
                initButton(dayBtns[index]);
                dayBtns[index].addMouseListener(new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        daysButtonMouseClicked(e);
                    }
                });
                daysPanel.add(dayBtns[index]);
            }
        }
    }

    private void initWeeksPanel() {
        weekNumberContainer = new JPanel(new BorderLayout(0, 0));
        weekNumberContainer.setOpaque(false);
        JPanel weekPanelContainer = new JPanel(new BorderLayout(0, 0));
        weekPanelContainer.setOpaque(false);
        separator = new JSeparator(JSeparator.VERTICAL);
        weekPanelContainer.add(separator, BorderLayout.LINE_END);
        JPanel weekPanel = new JPanel(new GridLayout(6, 1));
        weekPanelContainer.add(weekPanel, BorderLayout.CENTER);
        filler = new JPanel(new GridLayout(1, 1));
        weekPanel.setOpaque(false);
        filler.setOpaque(false);
        fillerBtn = new DateButton(false);
        fillerBtn.setText("00");
        fillerBtn.setVisible(false);
        filler.add(fillerBtn);
        for (int i = 0; i < 6; i++) {
            weekBtns[i] = new DateButton(false);
            weekBtns[i].setRolloverEnabled(false);
            if (i != 0) {
                weekBtns[i].setText("0" + (i + 1));
            }
            weekPanel.add(weekBtns[i]);
        }
        weekNumberContainer.add(weekPanelContainer, BorderLayout.CENTER);
        weekNumberContainer.add(filler, BorderLayout.PAGE_START);
    }
// </editor-fold>

    private void paintDayNames() {
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        String[] _weekDays;
        int day = firstDayOfWeek;
        switch (weekdayStyle) {
            case FULLNAME:
                _weekDays = dateFormatSymbols.getWeekdays();
                break;
            case FIRSTCHAR:
                String[] tmp = dateFormatSymbols.getWeekdays();
                _weekDays = new String[tmp.length];
                for (int i = 1; i < tmp.length; i++) {
                    _weekDays[i] = tmp[i].substring(0, 1);
                }

                break;
            case SHORTNAME:
            default:
                _weekDays = dateFormatSymbols.getShortWeekdays();
                break;
        }
        for (int i = 0; i < 7; i++) {
            initButton(weekDayBtns[i]);
            weekDayBtns[i].setEnabled(isEnabled() & true, false);
            weekDayBtns[i].setText(_weekDays[day]);
            weekDayBtns[i].setBackground(getWeekBackground());
            if (day == holiday) {
                weekDayBtns[i].setForeground(highlightHolidays ? getHolidayForeground() : getWeekForeground());
            } else {
                weekDayBtns[i].setForeground(getWeekForeground());
            }
            if (day < 7) {
                day++;
            } else {
                day -= 6;
            }
        }
    }

    private void paintWeekNumbers() {
        Calendar tmpCalendar = (Calendar) calendar.clone();
        for (int i = 0; i < 6; i++) {
            tmpCalendar.set(Calendar.DAY_OF_MONTH, ((i + 1) * 7) - 6);
            int week = tmpCalendar.get(Calendar.WEEK_OF_YEAR);
            String buttonText = writeFormattedValue(week);
            if (week < 10) {
                buttonText = writeFormattedValue(0) + buttonText;
            }
            weekBtns[i].setEnabled(isEnabled() & true, false);
            weekBtns[i].setText(buttonText);
            weekBtns[i].setForeground(weekForeground);
            weekBtns[i].setBackground(weekBackground);
            if ((i == 5) || (i == 6)) {
                weekBtns[i].setVisible(dayBtns[i * 6].isVisible());
            }
        }
    }

    private void paintDays() {
        Calendar tmpCalendar = (Calendar) calendar.clone();
        resetCalendar(tmpCalendar);
        tmpCalendar.set(Calendar.DAY_OF_MONTH, 1);

        Calendar minCal = Calendar.getInstance();
        minCal.setTime(minSelectableDate);
        resetCalendar(minCal);

        Calendar maxCal = Calendar.getInstance();
        maxCal.setTime(maxSelectableDate);
        resetCalendar(maxCal);

        int firstDay = tmpCalendar.get(Calendar.DAY_OF_WEEK) - tmpCalendar.getFirstDayOfWeek();
        if (firstDay < 0) {
            firstDay += 7;
        }
        Date firstDayInThisMonth = tmpCalendar.getTime();
        tmpCalendar.add(Calendar.MONTH, -1);
        tmpCalendar.set(Calendar.DAY_OF_MONTH, tmpCalendar.getActualMaximum(Calendar.DAY_OF_MONTH) - firstDay + 1);
        Date dd = tmpCalendar.getTime();
        int j = 0;
        while (dd.before(firstDayInThisMonth) ) {
            dayBtns[j].setEnabled(false, false);
            if (datesFromPreviousAndNextMonthShown) {
                dayBtns[j].setText(writeFormattedValue(tmpCalendar.get(Calendar.DAY_OF_MONTH)));
                dayBtns[j].setEnabled(false);
                dayBtns[j].setForeground(disabledDayForeground);
            } else {
                dayBtns[j].setText("");
            }
            tmpCalendar.add(Calendar.DAY_OF_MONTH, 1);
            dd = tmpCalendar.getTime();
            j++;
        }
        tmpCalendar.set(Calendar.DAY_OF_MONTH, 1);
        tmpCalendar.add(Calendar.MONTH, 1);
        Date firstDayInNextMonth = tmpCalendar.getTime();
        tmpCalendar.add(Calendar.MONTH, -1);
        Date d = tmpCalendar.getTime();
        int n = 0;

        while (d.before(firstDayInNextMonth)) {
            dayBtns[firstDay + n].setText(writeFormattedValue(n + 1));
            dayBtns[firstDay + n].setVisible(true);
            if (highlightHolidays) {
                if (tmpCalendar.get(Calendar.DAY_OF_WEEK) == holiday) {
                    //dayBtns[firstDay + n].setDecorations(getBackground(), getHolidayForeground(), getDayBorder());
                    dayBtns[firstDay + n].setDecorations(getBackground(), getHolidayForeground());
                } else {
                    dayBtns[firstDay + n].setDecorations(getBackground(), getForeground());
                }
            }

            if ((tmpCalendar.get(Calendar.DAY_OF_YEAR) == calendar.get(Calendar.DAY_OF_YEAR))
                    && (tmpCalendar.get(Calendar.YEAR) == calendar.get(Calendar.YEAR))) {
                dayBtns[firstDay + n].setOpaque(true);
                dayBtns[firstDay + n].setDecorations(getTodayBackground(), getTodayForeground(), getTodayBorder());
                today = tmpCalendar.getTime();
            }

            if (tmpCalendar.before(minCal) || tmpCalendar.after(maxCal)) {
                dayBtns[firstDay + n].setEnabled(false, false);
            } else {
                dayBtns[firstDay + n].setEnabled(isEnabled() & true, true);
            }

            n++;
            tmpCalendar.add(Calendar.DATE, 1);
            d = tmpCalendar.getTime();
        }

        for (int k = n + firstDay; k < 42; k++) {
            dayBtns[k].setEnabled(false, false);
            if (datesFromPreviousAndNextMonthShown) {
                dayBtns[k].setText(writeFormattedValue(tmpCalendar.get(Calendar.DAY_OF_MONTH)));
                dayBtns[k].setEnabled(false);
                dayBtns[k].setForeground(disabledDayForeground);
                tmpCalendar.add(Calendar.DAY_OF_MONTH, 1);
            } else {
                dayBtns[k].setText("");
            }
        }
        paintWeekNumbers();
        //hide the last week number if no dates are shown
        weekBtns[5].setVisible(!dayBtns[35].getText().isEmpty());
    }


    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">

    public Color getDisabledDayForeground() {
        return disabledDayForeground;
    }

    public void setDisabledDayForeground(Color disabledDayForeground) {
        this.disabledDayForeground = disabledDayForeground;
    }

    public Color getWeekNumberSeparatorColor() {
        return separator.getBackground();
    }

    public void setWeekNumberSeparatorColor(Color separatorColor) {
        separator.setBackground(separatorColor);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            //then repaint the calendar coz some buttons have to
            //remain disabled!!
            repaintCalendar();
        } else { //disable everything
            for (JButton button : dayBtns) {
                if (button != null) {
                    button.setEnabled(enabled);
                }
            }
            for (JButton button : weekBtns) {
                if (button != null) {
                    button.setEnabled(enabled);
                }
            }
            for (JButton button : weekDayBtns) {
                if (button != null) {
                    button.setEnabled(enabled);
                }
            }
        }
    }

    public NumberFormatter getNumberFormatter() {
        return numberFormatter;
    }

    public void setNumberFormatter(NumberFormatter numberFormatter) {
        this.numberFormatter = numberFormatter;
        repaintCalendar();
    }

    public Color getRolloverGradient1() {
        return rolloverGradient1;
    }

    public void setRolloverGradient1(Color rolloverGradient1) {
        this.rolloverGradient1 = rolloverGradient1;
    }

    public Color getRolloverGradient2() {
        return rolloverGradient2;
    }

    public void setRolloverGradient2(Color rolloverGradient2) {
        this.rolloverGradient2 = rolloverGradient2;
    }

    public int getRolloverGradientAlpha1() {
        return rolloverGradientAlpha1;
    }

    public void setRolloverGradientAlpha1(int rolloverGradientAlpha1) {
        this.rolloverGradientAlpha1 = rolloverGradientAlpha1;
    }

    public int getRolloverGradientAlpha2() {
        return rolloverGradientAlpha2;
    }

    public void setRolloverGradientAlpha2(int rolloverGradientAlpha2) {
        this.rolloverGradientAlpha2 = rolloverGradientAlpha2;
    }

    public Color getRolloverBorderColor() {
        return rolloverBorderColor;
    }

    public void setRolloverBorderColor(Color rolloverBorderColor) {
        this.rolloverBorderColor = rolloverBorderColor;
    }

    /**
     * Get the value of weekdayStyle
     *
     * @return the value of weekdayStyle
     */
    public WeekdayStyle getWeekdayStyle() {
        return weekdayStyle;
    }

    /**
     * Set the value of weekdayStyle
     *
     * @param weekdayStyle new value of weekdayStyle
     */
    public void setWeekdayStyle(WeekdayStyle weekdayStyle) {
        this.weekdayStyle = weekdayStyle;
        repaintCalendar();
    }

    /**
     * Get the value of holiday
     *
     * @return the value of holiday
     */
    public int getHoliday() {
        return holiday;
    }

    /**
     * Set the value of holiday
     *
     * @param holiday new value of holiday
     */
    public void setHoliday(int holiday) {
        this.holiday = holiday;
        repaintCalendar();
    }

    /**
     * Get the value of highlightHoliday
     *
     * @return the value of highlightHoliday
     */
    public boolean isHighlightHoliday() {
        return highlightHolidays;
    }

    /**
     * Highlights the holiday depending on the <code>holiday</code> value.
     * Default for <code>holiday</code> is 1, which is sunday.
     * @param highlightHolidays new value of highlightHoliday
     */
    public void setHighlightHoliday(boolean highlightHolidays) {
        this.highlightHolidays = highlightHolidays;
        repaintCalendar();
    }

    /**
     * Get the value of holidayForeground
     *
     * @return the value of holidayForeground
     */
    public Color getHolidayForeground() {
        return holidayForeground;
    }

    /**
     * Set the value of holidayForeground
     *
     * @param holidayForeground new value of holidayForeground
     */
    public void setHolidayForeground(Color holidayForeground) {
        this.holidayForeground = holidayForeground;
        repaintCalendar();
    }

    /**
     * Get the value of rolloverForeground
     *
     * @return the value of rolloverForeground
     */
    public Color getRolloverForeground() {
        return rolloverForeground;
    }

    /**
     * Set the value of rolloverForeground
     *
     * @param rolloverForeground new value of rolloverForeground
     */
    public void setRolloverForeground(Color rolloverForeground) {
        this.rolloverForeground = rolloverForeground;
        repaintCalendar();
    }

    /**
     * Get the value of todayBorder
     *
     * @return the value of todayBorder
     */
    public Border getTodayBorder() {
        return todayBorder;
    }

    /**
     * Set the value of todayBorder
     *
     * @param todayBorder new value of todayBorder
     */
    public void setTodayBorder(Border todayBorder) {
        this.todayBorder = todayBorder;
        repaintCalendar();
    }

    /**
     * Get the value of todayForeground
     *
     * @return the value of todayForeground
     */
    public Color getTodayForeground() {
        return todayForeground;
    }

    /**
     * Set the value of todayForeground
     *
     * @param todayForeground new value of todayForeground
     */
    public void setTodayForeground(Color todayForeground) {
        this.todayForeground = todayForeground;
        repaintCalendar();
    }

    /**
     * Get the value of todayBackground
     *
     * @return the value of todayBackground
     */
    public Color getTodayBackground() {
        return todayBackground;
    }

    /**
     * Set the value of todayBackground
     *
     * @param todayBackground new value of todayBackground
     */
    public void setTodayBackground(Color todayBackground) {
        this.todayBackground = todayBackground;
        repaintCalendar();
    }

    /**
     * Get the value of selectedBorder
     *
     * @return the value of selectedBorder
     */
    public Border getSelectedBorder() {
        return selectedBorder;
    }

    /**
     * Set the value of selectedBorder
     *
     * @param selectedBorder new value of selectedBorder
     */
    public void setSelectedBorder(Border selectedBorder) {
        this.selectedBorder = selectedBorder;
    }

    /**
     * Get the value of selectedForeground
     *
     * @return the value of selectedForeground
     */
    public Color getSelectedForeground() {
        return selectedForeground;
    }

    /**
     * Set the value of selectedForeground
     *
     * @param selectedForeground new value of selectedForeground
     */
    public void setSelectedForeground(Color selectedForeground) {
        this.selectedForeground = selectedForeground;
    }

    /**
     * Get the value of selectedBackground
     *
     * @return the value of selectedBackground
     */
    public Color getSelectedBackground() {
        return selectedBackground;
    }

    /**
     * Set the value of selectedBackground
     *
     * @param selectedBackground new value of selectedBackground
     */
    public void setSelectedBackground(Color selectedBackground) {
        this.selectedBackground = selectedBackground;
    }

    /**
     * Set the value of font
     *
     * @param font new value of font
     */
    @Override
    public void setFont(Font font) {
        super.setFont(font);
        repaintCalendar();
    }

    /**
     * Get the value of maxSelectableDate
     *
     * @return the value of maxSelectableDate
     */
    public Date getMaxSelectableDate() {
        return maxSelectableDate;
    }

    /**
     * Set the value of maxSelectableDate
     *
     * @param maxSelectableDate new value of maxSelectableDate
     */
    public void setMaxSelectableDate(Date maxSelectableDate) {
        this.maxSelectableDate = maxSelectableDate;
        repaintCalendar();
    }

    /**
     * Get the value of minSelectableDate
     *
     * @return the value of minSelectableDate
     */
    public Date getMinSelectableDate() {
        return minSelectableDate;
    }

    /**
     * Set the value of minSelectableDate
     *
     * @param minSelectableDate new value of minSelectableDate
     */
    public void setMinSelectableDate(Date minSelectableDate) {
        this.minSelectableDate = minSelectableDate;
        repaintCalendar();
    }

    /**
     * Get the value of selectedDay
     *
     * @return the value of selectedDay
     */
    public Date getSelectedDay() {
        return selectedDays.isEmpty() ? null : selectedDays.get(0);
    }

    public ArrayList<Date> getSelectedDays() {
        return selectedDays;
    }

    /**
     * Set the value of selectedDay
     *
     * @param selectedDay new value of selectedDay
     */
    public void setSelectedDay(Date selectedDay) {
//        Date oldSelectedDay = this.selectedDay;
//        this.selectedDay = selectedDay;
//        repaintCalendar();
//        propertyChangeSupport.firePropertyChange(PROP_SELECTEDDAY, oldSelectedDay, selectedDay);
    }

    /**
     * Get the value of weekForegorund
     *
     * @return the value of weekForegorund
     */
    public Color getWeekForeground() {
        return weekForeground;
    }

    /**
     * Set the value of weekForegorund
     *
     * @param weekForeground new value of weekForegorund
     */
    public void setWeekForeground(Color weekForeground) {
        this.weekForeground = weekForeground;
        repaintCalendar();
    }

    /**
     * Get the value of weekBackground
     *
     * @return the value of weekBackground
     */
    public Color getWeekBackground() {
        return weekBackground;
    }

    /**
     * Set the value of weekBackground
     *
     * @param weekBackground new value of weekBackground
     */
    public void setWeekBackground(Color weekBackground) {
        this.weekBackground = weekBackground;
        repaintCalendar();
    }

    /**
     * Get the value of datesFromPreviousAndNextMonthShown
     *
     * @return the value of datesFromPreviousAndNextMonthShown
     */
    public boolean isDatesFromPreviousAndNextMonthShown() {
        return datesFromPreviousAndNextMonthShown;
    }

    /**
     * Set the value of datesFromPreviousAndNextMonthShown
     *
     * @param datesFromPreviousAndNextMonthShown new value of datesFromPreviousAndNextMonthShown
     */
    public void setDatesFromPreviousAndNextMonthShown(boolean datesFromPreviousAndNextMonthShown) {
        this.datesFromPreviousAndNextMonthShown = datesFromPreviousAndNextMonthShown;
        repaintCalendar();
    }

    /**
     * Get the value of weekNumberVisible
     *
     * @return the value of weekNumberVisible
     */
    public boolean isWeekNumberVisible() {
        return weekNumberVisible;
    }

    /**
     * Set the value of weekNumberVisible
     *
     * @param weekNumberVisible new value of weekNumberVisible
     */
    public void setWeekNumberVisible(boolean weekNumberVisible) {
        this.weekNumberVisible = weekNumberVisible;
        initComponent();
        repaintCalendar();
    }

    /**
     * Get the value of locale
     *
     * @return the value of locale
     */
    @Override
    public Locale getLocale() {
        return locale;
    }

    /**
     * Set the value of locale
     *
     * @param locale new value of locale
     */
    @Override
    public void setLocale(Locale locale) {
        this.locale = locale;
        calendar = Calendar.getInstance(locale);
        repaintCalendar();
    }

    /*
     * Get the value of weekNumberPanelSize
     *
     * @return the value of weekNumberPanelSize
     *
    public Dimension getWeekNumberPanelSize() {
    return weekNumberPanelSize;
    }

    /**
     * Set the value of weekNumberPanelSize
     *
     * @param weekNumberPanelSize new value of weekNumberPanelSize
     *
    public void setWeekNumberPanelSize(Dimension weekNumberPanelSize) {
    this.weekNumberPanelSize = weekNumberPanelSize;
    }

    /*
     * Get the value of weekDayPanleSize
     *
     * @return the value of weekDayPanleSize
     *
    public Dimension getWeekDayPanleSize() {
    return weekDayPanleSize;
    }

    /*
     * Set the value of weekDayPanleSize
     *
     * @param weekDayPanleSize new value of weekDayPanleSize
     *
    public void setWeekDayPanleSize(Dimension weekDayPanleSize) {
    this.weekDayPanleSize = weekDayPanleSize;
    }
     */
    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg);
        //this.dayForeground = fg;
        repaintCalendar();
    }

    private Color getDayBackground() {
        return getBackground();
    }

    private Color getDayForeground() {
        return getForeground();
    }

    private Font getDayFont() {
        return getFont();
    }

    public Date getToday() {
        return today;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
        reset();
        paintCalendar();
    }

    public void setMonthYear(int month, int year) {
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        reset();
        paintCalendar();
    }

    public boolean isMultipleDateSelectionAllowed() {
        return multipleDateSelectionAllowed;
    }

    public void setMultipleDateSelectionAllowed(boolean multipleDateSelectionAllowed) {
        this.multipleDateSelectionAllowed = multipleDateSelectionAllowed;
    }

    

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Listeners">
    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        if (propertyChangeSupport == null) {
            propertyChangeSupport = new PropertyChangeSupport(this);
        }
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Events">
    public void daysButtonMouseClicked(MouseEvent e) {

        //do nothing if button is not focusable
        DateButton button = (DateButton) e.getSource();
        if (!button.isFocusable()) {
            return;
        }
        Calendar c = (Calendar) calendar.clone();
        resetCalendar(c);
        if (!e.isControlDown() || !multipleDateSelectionAllowed) {
            for (Date date : selectedDays) {
                c.setTime(date);
                DateButton db = findButton(c.get(Calendar.DAY_OF_MONTH));
                clearDateButtonSelection(db, c);
            }
            selectedDays.clear();
        }
        if (e.isControlDown() && button.isSelected()) {
            c.set(Calendar.DAY_OF_MONTH, getdecimalValue(button.getText()));
            selectedDays.remove(c.getTime());
            clearDateButtonSelection(button, c);
        } else {
            button.setSelected(true);
            button.setOpaque(true);
            button.setDecorations(getSelectedBackground(), getSelectedForeground(), getSelectedBorder());
            int date = getdecimalValue(button.getText());
            c = (Calendar) calendar.clone();
            c.set(Calendar.DATE, date);
            resetCalendar(c);
            selectedDays.add(c.getTime());
            propertyChangeSupport.firePropertyChange("date", null, getSelectedDay());
        }

    }
// </editor-fold>

    /**
     * Init all the buttons to default values
     */
    public void reset() {
        for (int i = 0; i < 42; i++) {
            initButton(dayBtns[i]);
        }
        for (int i = 0; i < 6; i++) {
            initButton(weekBtns[i]);

        }
        for (int i = 0; i < 7; i++) {
            initButton(weekDayBtns[i]);
        }
    }

    /**
     * Resets and repaints this component
     */
    public void repaintCalendar() {
        if (componentInitialized) {
            reset();
            paintCalendar();
        }
    }

    /**
     * Initializes the button
     * @param button DateButton to initialize
     */
    private void initButton(DateButton button) {
//        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        button.setDecorations(getBackground(), getForeground());
        button.setContentAreaFilled(false);
        button.setOpaque(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setBorderPainted(true);
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setFocusPainted(false);
        button.setFont(getDayFont());
        button.setEnabled(true);
        button.setVisible(true);
        button.setRolloverEnabled(true);
        button.setRolloverBorderColor(rolloverBorderColor);
        button.setRolloverForeground(rolloverForeground);
        button.setRolloverGradientColor1(rolloverGradient1);
        button.setRolloverGradientColor2(rolloverGradient2);
        button.setGradientColor1Alpha(rolloverGradientAlpha1);
        button.setGradientColor2Alpha(rolloverGradientAlpha2);
    }

    /**
     * Resets the given calendar instance time to 0
     * @param cal
     */
    private void resetCalendar(Calendar cal) {
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
    }

    // <editor-fold defaultstate="collapsed" desc="Read/Write Localized Numbers">
    private String writeFormattedValue(int value) {
        return numberFormatter != null ? numberFormatter.format(value) : String.valueOf(value);
    }

    private int getdecimalValue(String s) {
        return numberFormatter != null ? numberFormatter.decimalValue(s) : Integer.parseInt(s);
    }// </editor-fold>

    private DateButton findButton(int day) {
        String _day = writeFormattedValue(day);
        DateButton db = null;
        for (DateButton dateButton : dayBtns) {
            if (dateButton.isFocusable() && dateButton.getText().contentEquals(_day)) {
                db = dateButton;
                break;
            }
        }
        if (db == null) {
            System.out.println("Failed!!");
        }
        return db;
    }

    private void clearDateButtonSelection(DateButton db, Calendar c) {
        Color background = getBackground();
        Color foreground = getForeground();
        db.setOpaque(false);
        if (c.get(Calendar.DAY_OF_WEEK) == holiday) {
            //border = getDayBorder();
            background = getBackground();
            foreground = getHolidayForeground();
        }
        if (today.equals(c.getTime())) {
            //border = getTodayBorder();
            background = getTodayBackground();
            foreground = getTodayForeground();
            db.setOpaque(true);
        }
        db.setDecorations(background, foreground);
        db.setSelected(false);
    }
    // <editor-fold defaultstate="collapsed" desc="DateButton Code">
/*
    class DateButton extends JXButton  {


    private boolean focusable;
    private boolean selected;
    /*private Color oldBackground;
    private Color oldForeground;
    private Border oldBorder;
     *
    public DateButton(boolean focusable) {
    setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
    this.focusable = focusable;
    //addMouseListener(this);
    init();
    }

    @Override
    public boolean isFocusable() {
    return focusable;
    }


    /*
    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    if (focusable) {
    if (selected) {
    return;
    }
    oldBackground = getBackground();
    oldForeground = getForeground();
    oldBorder = getBorder();
    //setDecorations(getRolloverBackground(), getRolloverForeground(), getRolloverBorder());
    }
    }

    public void mouseExited(MouseEvent e) {
    if (focusable) {
    if (selected) {
    return;
    }
    setDecorations(oldBackground, oldForeground, oldBorder);
    }
    }
     *
    private void setDecorations(Color backgroundColor, Color foregroundColor, Border border) {
    setBackground(backgroundColor);
    setForeground(foregroundColor);
    setBorder(border);
    }

    public final void init() {

    }

    private void setDecorations(Color background, Color foreground) {
    setDecorations(background, foreground, javax.swing.BorderFactory.createEmptyBorder());
    }

    private void setEnabled(boolean b, boolean focusable) {
    setVisible(true);
    this.focusable = focusable;
    setEnabled(b);
    }


    };
    //</editor-fold>
     */
    // <editor-fold defaultstate="collapsed" desc="Main Method">

    public static void main(String[] s) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }
        javax.swing.JFrame frame = new javax.swing.JFrame("CalendarGrid");
        final CalendarGrid grid = new CalendarGrid();
        grid.setWeekNumberVisible(true);
        //grid.setHolidayForeground(Color.red);
//        grid.setHighlightHoliday(true);
//grid.setDayBorder(BorderFactory.createLoweredBevelBorder());
//        grid.setDatesFromPreviousAndNextMonthShown(false);
//        NumberFormatter nf = NumberFormatter.getInstance();
//        nf.setZeroDigit('\u0966');
//        grid.setNumberFormatter(nf);
//        grid.setForeground(Color.BLUE);
//        grid.setRolloverForeground(Color.red);
        grid.setPreferredSize(new Dimension(250, 250));
//        grid.setSelectedBackground(Color.darkGray);
//        grid.setSelectedForeground(Color.GREEN);
        frame.getContentPane().add(grid);

        //JXButton button = new JXButton("TEST BUTTON");

        //button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        //    setDecorations(getDayBackground(), getDayForeground(), getDayBorder());
//        button.setContentAreaFilled(false);
//        button.setOpaque(false);
//        //setBorder(BorderFactory.createEmptyBorder());
//        button.setBorderPainted(true);
//        button.setMargin(new Insets(0, 0, 0, 0));
//        button.setFocusPainted(false);
//
//        button.setEnabled(true);
//        button.setVisible(true);
//        button.setRolloverEnabled(true);
//        button.setRolloverForeground(Color.red);
//        frame.getContentPane().add(button);
//            button.setRolloverBorderColor(rolloverBorderColor);
//            setRolloverForeground(rolloverForeground);
//            setRolloverGradientColor1(rolloverGradient1);
//            setRolloverGradientColor2(rolloverGradient2);
//            setGradientColor1Alpha(rolloverGradientAlpha1);
//            setGradientColor2Alpha(rolloverGradientAlpha2);
         /*grid.setWeekNumberVisible(true);
        final JButton button1 = new JButton("Set Locale: SA");
        final JButton button2 = new JButton("Show disabled Numbers");
        final JButton button3 = new JButton("change font");
        final JButton button4 = new JButton("change week style");
        //new java.awt.Font("Tahoma", 1, 11)*
        frame.getContentPane().setLayout(new java.awt.FlowLayout());


        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
        button1.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().contentEquals("Set Locale: SA")) {
        grid.setLocale(new Locale("ar", "SA"));
        button1.setText("Set Locale: Default");
        } else {
        button1.setText("Set Locale: SA");
        grid.setLocale(Locale.getDefault());
        }
        }
        });
        button2.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().contentEquals("Show disabled Numbers")) {
        grid.setDatesFromPreviousAndNextMonthShown(true);
        button2.setText("hide disabled Numbers");
        } else {
        grid.setDatesFromPreviousAndNextMonthShown(false);
        button2.setText("Show disabled Numbers");

        }

        }
        });
        button3.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        grid.setFont(new java.awt.Font("Tahoma", 1, 11));

        }
        });
        button4.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        grid.setWeekdayStyle(WeekdayStyle.FIRSTCHAR);

        }
        });
        frame.pack();*/
        frame.setVisible(true);
    }
    //</editor-fold>
}
