
/*
 *  Copyright (C) 2011 Naveed Quadri
 *  naveedmurtuza@gmail.com
 *  www.naveedmurtuza.blogspot.com
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package org.gpl.SwingComponents.JCalendarWidget;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import org.gpl.SwingComponents.JCalendarWidget.beans.CalendarGrid.WeekdayStyle;
import org.gpl.SwingComponents.JCalendarWidget.beans.ImagePanel;
import org.gpl.SwingComponents.JCalendarWidget.beans.MonthsPanel;
import org.gpl.SwingComponents.JCalendarWidget.beans.NavigatorPanel.MonthStyle;

/**
 * JCalendarWidget is a highly customizable, multi lingual Calendar component for graphically picking a
 * date.It renders a calendar including the days of the week, the weeks of the year, and the days of the
 * month and can be easily used in GUI builders.
 *
 * Getters & Setters have very meaningful names and ignoring the javadocs for these. Will try to complete later....
 * @author Naveed Quadri
 */
public class JCalendarWidget extends ImagePanel implements PropertyChangeListener {

    private final String CALENDARPANEL_CARD = "CalendarPanel";
    private final String CALENDARGRID_CARD = "CalendarGrid";
    private final String MAINPANEL_CARD = "MainPanel";
    private Locale locale;
    private boolean componentInitialized = false;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        if(propertyChangeSupport != null)
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

    /** Creates new form JCalendarWidget */
    @SuppressWarnings("LeakingThisInConstructor")
    public JCalendarWidget(Locale locale) {
        this.locale = locale;
        initComponents();
        ((CardLayout) getLayout()).show(this, CALENDARPANEL_CARD);
        ((CardLayout) containerPanel.getLayout()).show(containerPanel, CALENDARGRID_CARD);
        navigatorPanel1.addPropertyChangeListener(this);
        monthsPanel1.addPropertyChangeListener(this);
        calendarGrid1.addPropertyChangeListener(this);
        componentInitialized = true;
    }

    public JCalendarWidget() {
        this(Locale.getDefault());
    }

    /**
     * Sets the foreground for disabled dates
     * @param disabledDayForeground foreground color for disabled dates
     */
    public void setDisabledDayForeground(Color disabledDayForeground) {
        calendarGrid1.setDisabledDayForeground(disabledDayForeground);
    }

    /**
     * Gets the foreground for disabled dates
     * @return foreground color for disabled dates
     */
    public Color getDisabledDayForeground() {
        return calendarGrid1.getDisabledDayForeground();
    }

    @Override
    public void setForeground(Color fg) {
        if (componentInitialized) {
            navigatorPanel1.setForeground(fg);
            monthsPanel1.setForeground(fg);
            calendarGrid1.setForeground(fg);
            calendarGrid1.setWeekForeground(fg);

        }
    }

    /**
     * Sets the rollover foreground color
     * @param rolloverForeground rollover foreground color
     */
    public void setRolloverForeground(Color rolloverForeground) {
        navigatorPanel1.setRolloverForeground(rolloverForeground);
        monthsPanel1.setRolloverForeground(rolloverForeground);
        calendarGrid1.setRolloverForeground(rolloverForeground);
    }

    /**
     * Set the rollover cursor (Changes the cursor of NAvigator panel only! When you rollover the month name)
     * @param rolloverCursor rollover cursor
     */
    public void setRolloverCursor(Cursor rolloverCursor) {
        navigatorPanel1.setRolloverCursor(rolloverCursor);
    }

    /**
     * Sets the selected icon for the left (back) navigation.
     * @param previousBtnSelectedIcon icon
     */
    public void setPreviousBtnSelectedIcon(ImageIcon previousBtnSelectedIcon) {
        navigatorPanel1.setPreviousBtnSelectedIcon(previousBtnSelectedIcon);
    }

    /**
     * Sets the rollover icon for the left (back) navigation.
     * @param previousBtnRolloverIcon rollover icon
     */
    public void setPreviousBtnRolloverIcon(ImageIcon previousBtnRolloverIcon) {
        navigatorPanel1.setPreviousBtnRolloverIcon(previousBtnRolloverIcon);
    }

    /**
     * Sets the icon for the left (back) navigation.
     * @param previousBtnIcon icon
     */
    public void setPreviousBtnIcon(ImageIcon previousBtnIcon) {
        navigatorPanel1.setPreviousBtnIcon(previousBtnIcon);
    }

    /**
     * Set the {@link org.gpl.SwingComponents.JCalendarWidget.NumberFormatter } for the component to localize the digits.
     * @param numberFormatter
     */
    public void setNumberFormatter(NumberFormatter numberFormatter) {

        navigatorPanel1.setNumberFormatter(numberFormatter);
        calendarGrid1.setNumberFormatter(numberFormatter);
    }

    /**
     * Sets them selected icon for the right (forward) navigation.
     * @param nextBtnSelectedIcon icon
     */
    public void setNextBtnSelectedIcon(ImageIcon nextBtnSelectedIcon) {
        navigatorPanel1.setNextBtnSelectedIcon(nextBtnSelectedIcon);
    }

    /**
     * Sets them rollover icon for the right (forward) navigation.
     * @param nextBtnRollOverIcon icon
     */
    public void setNextBtnRollOverIcon(Icon nextBtnRollOverIcon) {
        navigatorPanel1.setNextBtnRollOverIcon(nextBtnRollOverIcon);
    }

    /**
     * Sets them icon for the right (forward) navigation.
     * @param nextBtnIcon icon
     */
    public void setNextBtnIcon(Icon nextBtnIcon) {
        navigatorPanel1.setNextBtnIcon(nextBtnIcon);
    }

    /**
     * Set the {@link org.gpl.SwingComponents.JCalendarWidget.beans.NavigatorPanel.MonthStyle } for the component.
     * Displays either Full month name or short.
     * @param monthStyle
     */
    public void setMonthStyle(MonthStyle monthStyle) {
        navigatorPanel1.setMonthStyle(monthStyle);
    }

    /**
     * Sets the month and notifies all the listeners
     * @param month
     */
    public void setMonth(int month) {
        navigatorPanel1.setMonth(month);
    }

    @Override
    public void setLocale(Locale locale) {
        if (componentInitialized) {
            navigatorPanel1.setLocale(locale);
            monthsPanel1.setLocale(locale);

            calendarGrid1.setLocale(locale);
        }
    }

    @Override
    public void setFont(Font font) {
        if (componentInitialized) {
            monthsPanel1.setFont(font);
            navigatorPanel1.setFont(font);

            calendarGrid1.setFont(font);
        }
    }

    /**
     * Get the value of rolloverForeground
     *
     * @return the value of rolloverForeground
     */
    public Color getRolloverForeground() {
        return navigatorPanel1.getRolloverForeground();
    }

    /**
     * Get the value of rolloverCursor
     *
     * @return the value of rolloverCursor
     */
    public Cursor getRolloverCursor() {
        return navigatorPanel1.getRolloverCursor();
    }

    /**
     * Gets the selected icon for the left (backward) navigation.
     * @return the selected icon for the left (backward) navigation.
     */
    public Icon getPreviousBtnSelectedIcon() {
        return navigatorPanel1.getPreviousBtnSelectedIcon();
    }

    /**
     * Gets the rollover icon for the left (backward) navigation.
     * @return the rollover icon for the left (backward) navigation.
     */
    public Icon getPreviousBtnRolloverIcon() {
        return navigatorPanel1.getPreviousBtnRolloverIcon();
    }

    /**
     * Gets the icon for the left (backward) navigation.
     * @return the icon for the left (backward) navigation.
     */
    public Icon getPreviousBtnIcon() {
        return navigatorPanel1.getPreviousBtnIcon();
    }

    /**
     * Get the {@link org.gpl.SwingComponents.JCalendarWidget.NumberFormatter } for the component required localize the digits.
     * @return numberFormatter
     */
    public NumberFormatter getNumberFormatter() {
        return navigatorPanel1.getNumberFormatter();
    }

    /**
     * Gets the selected icon for the right (forward) navigation.
     * @return the selected icon for the right (forward) navigation.
     */
    public Icon getNextBtnSelectedIcon() {
        return navigatorPanel1.getNextBtnSelectedIcon();
    }

    /**
     * Gets the rollover icon for the right (forward) navigation.
     * @return the rollover icon for the right (forward) navigation.
     */
    public Icon getNextBtnRollOverIcon() {
        return navigatorPanel1.getNextBtnRollOverIcon();
    }

    /**
     * Gets the icon for the right (forward) navigation.
     * @return the icon for the right (forward) navigation.
     */
    public Icon getNextBtnIcon() {
        return navigatorPanel1.getNextBtnIcon();
    }

    /**
     * Get the {@link org.gpl.SwingComponents.JCalendarWidget.beans.NavigatorPanel.MonthStyle } for the component.
     * Displays either Full month name or short.
     * @return monthStyle
     */
    public MonthStyle getMonthStyle() {
        return navigatorPanel1.getMonthStyle();
    }

    /**
     * Gets the currently selected month
     * @return month
     */
    public int getMonth() {
        return navigatorPanel1.getMonth();
    }

    public void setRolloverMonthIcon(Icon rolloverMonthIcon) {
        monthsPanel1.setRolloverMonthIcon(rolloverMonthIcon);
    }

    public void setRolloverGradientColor2(Color rolloverGradientColor2) {
        calendarGrid1.setRolloverGradient2(rolloverGradientColor2);
        monthsPanel1.setRolloverGradientColor2(rolloverGradientColor2);
    }

    public void setRolloverGradientColor1(Color rolloverGradientColor1) {
        calendarGrid1.setRolloverGradient1(rolloverGradientColor1);
        monthsPanel1.setRolloverGradientColor1(rolloverGradientColor1);
    }

    public void setRolloverBorderColor(Color rolloverBorderColor) {
        monthsPanel1.setRolloverBorderColor(rolloverBorderColor);
        calendarGrid1.setRolloverBorderColor(rolloverBorderColor);
    }

    public void setMonthIcon(Icon monthIcon) {
        monthsPanel1.setMonthIcon(monthIcon);
    }

    public void setGradientColor2Alpha(int gradientColor2Alpha) {
        calendarGrid1.setRolloverGradientAlpha2(gradientColor2Alpha);
        monthsPanel1.setGradientColor2Alpha(gradientColor2Alpha);
    }

    public void setGradientColor1Alpha(int gradientColor1Alpha) {
        calendarGrid1.setRolloverGradientAlpha1(gradientColor1Alpha);
        monthsPanel1.setGradientColor1Alpha(gradientColor1Alpha);
    }

    public Icon getRolloverMonthIcon() {
        return monthsPanel1.getRolloverMonthIcon();
    }

    public Icon getMonthIcon() {
        return monthsPanel1.getMonthIcon();
    }

    public void setWeekdayStyle(WeekdayStyle weekdayStyle) {
        calendarGrid1.setWeekdayStyle(weekdayStyle);
    }

    public void setTodayForeground(Color todayForeground) {
        calendarGrid1.setTodayForeground(todayForeground);
    }

    public void setTodayBorder(Border todayBorder) {
        calendarGrid1.setTodayBorder(todayBorder);
    }

    public void setTodayBackground(Color todayBackground) {
        calendarGrid1.setTodayBackground(todayBackground);
    }

    public void setSelectedForeground(Color selectedForeground) {
        calendarGrid1.setSelectedForeground(selectedForeground);
    }

    public void setSelectedDay(Date selectedDay) {
        calendarGrid1.setSelectedDay(selectedDay);
    }

    public void setSelectedBorder(Border selectedBorder) {
        calendarGrid1.setSelectedBorder(selectedBorder);
    }

    public void setSelectedBackground(Color selectedBackground) {
        calendarGrid1.setSelectedBackground(selectedBackground);
    }

    public void setMonthYear(int month, int year) {
        calendarGrid1.setMonthYear(month, year);
    }

    public void setMinSelectableDate(Date minSelectableDate) {
        calendarGrid1.setMinSelectableDate(minSelectableDate);
    }

    public void setMaxSelectableDate(Date maxSelectableDate) {
        calendarGrid1.setMaxSelectableDate(maxSelectableDate);
    }

    public void setHolidayForeground(Color holidayForeground) {
        calendarGrid1.setHolidayForeground(holidayForeground);
    }

    public void setHoliday(int holiday) {
        calendarGrid1.setHoliday(holiday);
    }

    public void setHighlightHoliday(boolean highlightHolidays) {
        calendarGrid1.setHighlightHoliday(highlightHolidays);
    }

    public void setDatesFromPreviousAndNextMonthShown(boolean datesFromPreviousAndNextMonthShown) {
        calendarGrid1.setDatesFromPreviousAndNextMonthShown(datesFromPreviousAndNextMonthShown);
    }

    public boolean isWeekNumberVisible() {
        return calendarGrid1.isWeekNumberVisible();
    }

    public boolean isHighlightHoliday() {
        return calendarGrid1.isHighlightHoliday();
    }

    public boolean isDatesFromPreviousAndNextMonthShown() {
        return calendarGrid1.isDatesFromPreviousAndNextMonthShown();
    }

    public WeekdayStyle getWeekdayStyle() {
        return calendarGrid1.getWeekdayStyle();
    }

    public Color getTodayForeground() {
        return calendarGrid1.getTodayForeground();
    }

    public Border getTodayBorder() {
        return calendarGrid1.getTodayBorder();
    }

    public Color getTodayBackground() {
        return calendarGrid1.getTodayBackground();
    }

    public Date getToday() {
        return calendarGrid1.getToday();
    }

    public Color getSelectedForeground() {
        return calendarGrid1.getSelectedForeground();
    }

    public Date getSelectedDay() {
        return calendarGrid1.getSelectedDay();
    }

    public Border getSelectedBorder() {
        return calendarGrid1.getSelectedBorder();
    }

    public Color getSelectedBackground() {
        return calendarGrid1.getSelectedBackground();
    }

    public Date getMinSelectableDate() {
        return calendarGrid1.getMinSelectableDate();
    }

    public Date getMaxSelectableDate() {
        return calendarGrid1.getMaxSelectableDate();
    }

    public Color getHolidayForeground() {
        return calendarGrid1.getHolidayForeground();
    }

    public int getHoliday() {
        return calendarGrid1.getHoliday();
    }

    public void setWeekNumberVisible(boolean weekNumberVisible) {
        calendarGrid1.setWeekNumberVisible(weekNumberVisible);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        calendarPanel = new javax.swing.JPanel();
        navigatorPanel1 = new org.gpl.SwingComponents.JCalendarWidget.beans.NavigatorPanel(locale);
        containerPanel = new javax.swing.JPanel();
        monthsPanel1 = new org.gpl.SwingComponents.JCalendarWidget.beans.MonthsPanel(locale);
        calendarGrid1 = new org.gpl.SwingComponents.JCalendarWidget.beans.CalendarGrid();

        setLayout(new java.awt.CardLayout());

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.CardLayout());

        calendarPanel.setOpaque(false);
        calendarPanel.setLayout(new java.awt.BorderLayout());

        navigatorPanel1.setPreferredSize(new java.awt.Dimension(140, 30));
        calendarPanel.add(navigatorPanel1, java.awt.BorderLayout.PAGE_START);

        containerPanel.setOpaque(false);
        containerPanel.setLayout(new java.awt.CardLayout());
        containerPanel.add(monthsPanel1, "MonthsPanel");
        containerPanel.add(calendarGrid1, "CalendarGrid");

        calendarPanel.add(containerPanel, java.awt.BorderLayout.CENTER);

        mainPanel.add(calendarPanel, "CalendarPanel");

        add(mainPanel, "MainPanel");
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.gpl.SwingComponents.JCalendarWidget.beans.CalendarGrid calendarGrid1;
    private javax.swing.JPanel calendarPanel;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel mainPanel;
    private org.gpl.SwingComponents.JCalendarWidget.beans.MonthsPanel monthsPanel1;
    private org.gpl.SwingComponents.JCalendarWidget.beans.NavigatorPanel navigatorPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (componentInitialized) {
            calendarGrid1.setEnabled(enabled);

            monthsPanel1.setEnabled(enabled);
            navigatorPanel1.setEnabled(enabled);

        }
    }

    public ArrayList<Date> getSelectedDays() {
        return calendarGrid1.getSelectedDays();
    }

    // <editor-fold defaultstate="collapsed" desc="Main Method">
    public static void main(String[] s) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        javax.swing.JFrame frame = new javax.swing.JFrame("CalendarPanel");
        JCalendarWidget panel = new JCalendarWidget();
        panel.setImage(Toolkit.getDefaultToolkit().getImage(JCalendarWidget.class.getResource("resources/background.jpg")));
        frame.getContentPane().add(panel);
        frame.pack();

        frame.setVisible(true);
    }
//</editor-fold>

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getSource());
        System.out.println(evt.getPropertyName());
        System.out.println(evt.getOldValue());
        System.out.println(evt.getNewValue());
        if (evt.getSource() instanceof MonthsPanel) {
            navigatorPanel1.setMonth(Integer.parseInt(evt.getNewValue().toString()));
            ((CardLayout) containerPanel.getLayout()).show(containerPanel, "CalendarGrid");
        } else if (evt.getPropertyName().contentEquals("currentView")) {
            switch (Integer.parseInt((evt.getNewValue().toString()))) {
                case JCalendarConsts.SHOW_MONTHS:
                    ((CardLayout) containerPanel.getLayout()).show(containerPanel, "MonthsPanel");
                    break;
                case JCalendarConsts.SHOW_CALENDAR_GRID:
                    ((CardLayout) containerPanel.getLayout()).show(containerPanel, "CalendarGrid");
                    break;
                case JCalendarConsts.SHOW_CALENDAR:
                    ((CardLayout) this.getLayout()).show(this, MAINPANEL_CARD);
                    break;
            }
        } else if (evt.getPropertyName().contentEquals("date")) {
            propertyChangeSupport.firePropertyChange("date", null, evt.getNewValue());
        }

        calendarGrid1.setMonthYear(navigatorPanel1.getMonth(), navigatorPanel1.getYear());

    }
}
