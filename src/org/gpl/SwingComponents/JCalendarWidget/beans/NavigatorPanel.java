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

package org.gpl.SwingComponents.JCalendarWidget.beans;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import org.gpl.SwingComponents.JCalendarWidget.*;


/**
 * 
 * @author Naveed
 * @version 1.0
 */
public class NavigatorPanel extends JPanel implements PropertyChangeListener {

    public void propertyChange(PropertyChangeEvent evt) {
        switch (currentView) {
            case JCalendarConsts.SHOW_MONTH_YEAR:
                DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
                String[] months = monthStyle == MonthStyle.FULLNAME ? dateFormatSymbols.getMonths() : dateFormatSymbols.getShortMonths();
                dateTimeLabel.setText(months[month] + " , " + (numberFormatter != null ? numberFormatter.format(year) : year));
                break;
            case JCalendarConsts.SHOW_YEAR:
                dateTimeLabel.setText(numberFormatter != null ? numberFormatter.format(year) : String.valueOf(year));
                break;
        }
    }

    public enum MonthStyle {
        FULLNAME,
        SHORTNAME
    }

    //<editor-fold desc="Varaible Declaration">
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private int currentView = JCalendarConsts.SHOW_MONTH_YEAR;
    private int year;
    private Locale locale;
    private int month;
    private Color rolloverForeground;
    private Cursor rolloverCursor;
    private Color oldForeground;
    private NumberFormatter numberFormatter;
    private Cursor oldCursor;
    private MonthStyle monthStyle = MonthStyle.FULLNAME;
    public static final String PROP_MONTHSTYLE = "monthStyle";
    public static final String PROP_MONTH = "month";
    public static final String PROP_YEAR = "year";
    public static final String PROP_CURRENTVIEW = "currentView";
    public static final String PROP_NUMBERFORMATTER = "numberFormatter";
    //</editor-fold>

    //<editor-fold desc="Construtors">
    public NavigatorPanel() {
        this(Locale.getDefault());
    }

    public NavigatorPanel(Locale locale) {
        this.locale = locale;
        Calendar cal = Calendar.getInstance(locale);
        month = cal.get(Calendar.MONTH);
        year = cal.get(Calendar.YEAR);
        initComponents();
        setOpaque(false);//make it transparent
        addPropertyChangeListener(this);
        propertyChangeSupport.firePropertyChange(PROP_MONTH, null, null);
    }
    //</editor-fold>

    //<editor-fold desc="Getter & Setter">
    /**
     * Get the value of rolloverCursor
     *
     * @return the value of rolloverCursor
     */
    public Cursor getRolloverCursor() {
        return rolloverCursor;
    }

    /**
     * Set the value of rolloverCursor
     *
     * @param rolloverCursor new value of rolloverCursor
     */
    public void setRolloverCursor(Cursor rolloverCursor) {
        this.rolloverCursor = rolloverCursor;

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
     * Get the NumberFormatter.
     * @see NumberFormatter
     * @return the value of numberFormatter
     */
    public NumberFormatter getNumberFormatter() {
        return numberFormatter;
    }

    /**
     *
     * @param numberFormatter new instance of <code>NumberFormatter</code>
     */
    public void setNumberFormatter(NumberFormatter numberFormatter) {
        NumberFormatter oldNumberFormatter = this.numberFormatter;
        this.numberFormatter = numberFormatter;
        propertyChangeSupport.firePropertyChange(PROP_NUMBERFORMATTER, oldNumberFormatter, numberFormatter);
    }

    /**
     * Set the value of rolloverForeground
     *
     * @param rolloverForeground new value of rolloverForeground
     */
    public void setRolloverForeground(Color rolloverForeground) {
        this.rolloverForeground = rolloverForeground;
    }

    /**
     * Get the value of nextBtnIcon
     *
     * @return the value of nextBtnIcon
     */
    public Icon getNextBtnIcon() {
        return nextBtn.getIcon();
    }

    /**
     * Set the value of nextBtnIcon
     *
     * @param nextBtnIcon new value of nextBtnIcon
     */
    public void setNextBtnIcon(Icon nextBtnIcon) {
        nextBtn.setIcon(nextBtnIcon);
    }

    /**
     * Get the value of nextBtnRollOverIcon
     *
     * @return the value of nextBtnRollOverIcon
     */
    public Icon getNextBtnRollOverIcon() {
        return nextBtn.getRolloverIcon();
    }

    /**
     * Set the value of nextBtnRollOverIcon
     *
     * @param nextBtnRollOverIcon new value of nextBtnRollOverIcon
     */
    public void setNextBtnRollOverIcon(Icon nextBtnRollOverIcon) {
        nextBtn.setRolloverIcon(nextBtnRollOverIcon);
    }

    /**
     * Get the value of nextBtnSelectedIcon
     *
     * @return the value of nextBtnSelectedIcon
     */
    public Icon getNextBtnSelectedIcon() {
        return nextBtn.getSelectedIcon();
    }

    /**
     * Set the value of nextBtnSelectedIcon
     *
     * @param nextBtnSelectedIcon new value of nextBtnSelectedIcon
     */
    public void setNextBtnSelectedIcon(ImageIcon nextBtnSelectedIcon) {
        nextBtn.setSelectedIcon(nextBtnSelectedIcon);

    }

    /**
     * Get the value of previousBtnSelectedIcon
     *
     * @return the value of previousBtnSelectedIcon
     */
    public Icon getPreviousBtnSelectedIcon() {
        return previousBtn.getSelectedIcon();
    }

    /**
     * Set the value of previousBtnSelectedIcon
     *
     * @param previousBtnSelectedIcon new value of previousBtnSelectedIcon
     */
    public void setPreviousBtnSelectedIcon(ImageIcon previousBtnSelectedIcon) {
        previousBtn.setSelectedIcon(previousBtnSelectedIcon);
    }

    /**
     * Get the value of previousBtnRolloverIcon
     *
     * @return the value of previousBtnRolloverIcon
     */
    public Icon getPreviousBtnRolloverIcon() {
        return previousBtn.getRolloverIcon();
    }

    /**
     * Set the value of previousBtnRolloverIcon
     *
     * @param previousBtnRolloverIcon new value of previousBtnRolloverIcon
     */
    public void setPreviousBtnRolloverIcon(ImageIcon previousBtnRolloverIcon) {
        previousBtn.setRolloverIcon(previousBtnRolloverIcon);
    }

    /**
     * Get the value of previousBtnIcon
     *
     * @return the value of previousBtnIcon
     */
    public Icon getPreviousBtnIcon() {
        return previousBtn.getIcon();
    }

    /**
     * Set the value of previousBtnIcon
     *
     * @param previousBtnIcon new value of previousBtnIcon
     */
    public void setPreviousBtnIcon(ImageIcon previousBtnIcon) {
        previousBtn.setIcon(previousBtnIcon);
    }

    /**
     * Get the value of monthStyle
     *
     * @return the value of monthStyle
     */
    public MonthStyle getMonthStyle() {
        return monthStyle;
    }

    /**
     * Set the value of monthStyle
     *
     * @param monthStyle new value of monthStyle
     */
    public void setMonthStyle(MonthStyle monthStyle) {
        MonthStyle oldMonthStyle = this.monthStyle;
        this.monthStyle = monthStyle;
        propertyChangeSupport.firePropertyChange(PROP_MONTHSTYLE, oldMonthStyle, monthStyle);
    }

    public int getCurrentView() {
        return currentView;
    }

    /**
     * Set the value of currentView
     *
     * @param currentView
     */
    protected void setCurrentView(int currentView) {
        int oldCurrentView = this.currentView;
        this.currentView = currentView;
        propertyChangeSupport.firePropertyChange(PROP_CURRENTVIEW, oldCurrentView, currentView);
    }

    /**
     * Get the value of month
     *
     * @return the value of month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Set the value of month
     *
     * @param month new value of month
     */
    public void setMonth(int month) {
        this.month = month;
        currentView = JCalendarConsts.SHOW_MONTH_YEAR;
        propertyChangeSupport.firePropertyChange(PROP_MONTH, null, month);
    }

    /**
     * 
     * @param year sets the year
     */
    protected void setYear(int year) {
        int oldYear = this.year;
        this.year = year;
        propertyChangeSupport.firePropertyChange(PROP_YEAR, oldYear, year);
    }

    /**
     *
     * @return the current year
     */
    public int getYear() {
        return year;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFont(Font font) {
        super.setFont(font);
        if (dateTimeLabel != null) {
            dateTimeLabel.setFont(font);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg);
        if (dateTimeLabel != null) {
            dateTimeLabel.setForeground(fg);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setLocale(Locale locale) {
        this.locale = locale;
        propertyChangeSupport.firePropertyChange(PROP_MONTH, null, month);
    }

    /**
     *
     * {@inheritDoc }
     */
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        dateTimeLabel.setEnabled(enabled);
        nextBtn.setEnabled(enabled);
        previousBtn.setEnabled(enabled);
    }

//</editor-fold>

    //<editor-fold desc="add/remove Listeners">
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
//</editor-fold>

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.    
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        previousBtn = new javax.swing.JButton();
        dateTimeLabel = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        previousBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gpl/SwingComponents/JCalendarWidget/resources/navigate-left16.png"))); // NOI18N
        previousBtn.setBorderPainted(false);
        previousBtn.setContentAreaFilled(false);
        previousBtn.setFocusPainted(false);
        previousBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        previousBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        previousBtn.setMaximumSize(new java.awt.Dimension(20, 20));
        previousBtn.setMinimumSize(new java.awt.Dimension(20, 20));
        previousBtn.setPreferredSize(new java.awt.Dimension(20, 20));
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });
        add(previousBtn, java.awt.BorderLayout.WEST);

        dateTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateTimeLabel.setText("Placeholder");
        dateTimeLabel.setPreferredSize(new java.awt.Dimension(100, 14));
        dateTimeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateTimeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dateTimeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateTimeLabelMouseExited(evt);
            }
        });
        add(dateTimeLabel, java.awt.BorderLayout.CENTER);

        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gpl/SwingComponents/JCalendarWidget/resources/navigate-right16.png"))); // NOI18N
        nextBtn.setAlignmentX(0.5F);
        nextBtn.setBorderPainted(false);
        nextBtn.setContentAreaFilled(false);
        nextBtn.setFocusPainted(false);
        nextBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        nextBtn.setMaximumSize(new java.awt.Dimension(20, 20));
        nextBtn.setMinimumSize(new java.awt.Dimension(20, 20));
        nextBtn.setPreferredSize(new java.awt.Dimension(20, 20));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        add(nextBtn, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents
    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBtnActionPerformed
        nextBtn.setEnabled(true);
        goStepBackward();
    }//GEN-LAST:event_previousBtnActionPerformed
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        previousBtn.setEnabled(true);
        goStepForward();
    }//GEN-LAST:event_nextBtnActionPerformed
    private void dateTimeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTimeLabelMouseClicked
//        if (evt.getClickCount() == 2) {
        {
            setCurrentView(currentView == JCalendarConsts.SHOW_MONTH_YEAR ? JCalendarConsts.SHOW_YEAR : JCalendarConsts.SHOW_MONTH_YEAR);
        }
    }//GEN-LAST:event_dateTimeLabelMouseClicked

    private void dateTimeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTimeLabelMouseEntered
            oldForeground = getForeground();
            oldCursor = getCursor();
            dateTimeLabel.setForeground(rolloverForeground);
            dateTimeLabel.setCursor(rolloverCursor);
    }//GEN-LAST:event_dateTimeLabelMouseEntered

    private void dateTimeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTimeLabelMouseExited
        dateTimeLabel.setForeground(oldForeground);
        dateTimeLabel.setCursor(oldCursor);
    }//GEN-LAST:event_dateTimeLabelMouseExited
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateTimeLabel;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton previousBtn;
    // End of variables declaration//GEN-END:variables

    /**
     * Subtracts the month or the year depending on the currentStatus by one
     */
    private void goStepBackward() {
        switch (currentView) {
            case JCalendarConsts.SHOW_MONTH_YEAR:
                month -= 1;
                if (month < 0) {
                    month = 11;
                    year -= 1;
                }
                if (month == 0 && year == 1900) {
                    previousBtn.setEnabled(false);
                }
                break;
            case JCalendarConsts.SHOW_YEAR:
                year -= 1;
                if (year == 1900) {
                    previousBtn.setEnabled(false);
                }
                break;
        }
        propertyChangeSupport.firePropertyChange(PROP_MONTH, null, null);

    }

    /**
     * Advances the month or the year depending on the currentStatus by one
     */
    private void goStepForward() {
        switch (currentView) {
            case JCalendarConsts.SHOW_MONTH_YEAR:
                month += 1;
                if (month > 11) {
                    month = 0;
                    year += 1;
                }
                if (month == 11 && year == 2999) {
                    nextBtn.setEnabled(false);
                }
                break;
            case JCalendarConsts.SHOW_YEAR:
                year += 1;
                if (year == 2999) {
                    nextBtn.setEnabled(false);
                }
                break;
        }
        propertyChangeSupport.firePropertyChange(PROP_MONTH, null, null);
    }

    // <editor-fold defaultstate="collapsed" desc="Main Method">
    public static void main(String[] s) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }
        javax.swing.JFrame frame = new javax.swing.JFrame("NavigatorPanel");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //NumberFormatter nf = NumberFormatter.getInstance();
        //nf.setZeroDigit('\u0660');
        NavigatorPanel panel = new NavigatorPanel();
        //panel.setRolloverForeground(Color.red);
        //panel.setNumberFormatter(nf);
        ImageIcon icon1 = new ImageIcon(Toolkit.getDefaultToolkit().createImage(JCalendarWidget.class.getResource("resources/hide-left16.png")));
        ImageIcon icon2 = new ImageIcon(Toolkit.getDefaultToolkit().createImage(JCalendarWidget.class.getResource("resources/hide-right16.png")));
        ImageIcon icon3 = new ImageIcon(Toolkit.getDefaultToolkit().createImage(JCalendarWidget.class.getResource("resources/navigate-left16.png")));
        ImageIcon icon4 = new ImageIcon(Toolkit.getDefaultToolkit().createImage(JCalendarWidget.class.getResource("resources/navigate-right16.png")));
        panel.setNextBtnIcon(icon4);
        panel.setNextBtnRollOverIcon(icon2);
        panel.setNextBtnSelectedIcon(icon4);
        panel.setPreviousBtnIcon(icon3);
        panel.setPreviousBtnRolloverIcon(icon1);
        panel.setPreviousBtnSelectedIcon(icon3);
        panel.setRolloverCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Image img = Toolkit.getDefaultToolkit().createImage(JCalendarConsts.class.getResource("resources/header.png"));
        //panel.setImage(img);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
//</editor-fold>
}
