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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.DateFormatSymbols;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import org.gpl.SwingComponents.JCalendarWidget.JCalendarConsts;

/**
 *
 * @author Naveed
 * @version 1.0
 */
public class MonthsPanel extends JPanel implements ActionListener {

    // <editor-fold defaultstate="collapsed" desc="Variable Declaration">
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private DateButton[] monthBtns;
    private String[] months;
    private Locale locale;
    private Icon monthIcon;
    private Icon rolloverMonthIcon;
    private Color rolloverGradientColor2;
    private Color rolloverGradientColor1;
    private Color rolloverForeground;
    private Color rolloverBorderColor;
    private int gradientColor2Alpha;
    private int gradientColor1Alpha;
    private boolean componentInitialized = false;
    private int month;
    public static final String PROP_MONTH = "month";

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    /** Creates new form MonthsPanel */
    public MonthsPanel() {
        this(Locale.getDefault());
    }

    public MonthsPanel(Locale locale) {
        initComponents();
        monthBtns = new DateButton[12];
        this.locale = locale;
        setLayout(new GridLayout(3, 4, 0, 0));
        for (int i = 0; i < 12; i++) {
            monthBtns[i] = new DateButton("");
            monthBtns[i].addActionListener(this);
            add(monthBtns[i]);
        }
        paintMonthsPanel();
        componentInitialized = true;
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
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
        propertyChangeSupport.firePropertyChange(PROP_MONTH, null, month);
    }

    /**
     * Set the value of RolloverGradientColor2
     * @param rolloverGradientColor2
     */
    public void setRolloverGradientColor2(Color rolloverGradientColor2) {
        this.rolloverGradientColor2 = rolloverGradientColor2;
        paintMonthsPanel();
    }

    /**
     * Set the value of RolloverGradientColor1
     * @param rolloverGradientColor1
     */
    public void setRolloverGradientColor1(Color rolloverGradientColor1) {
        this.rolloverGradientColor1 = rolloverGradientColor1;
        paintMonthsPanel();
    }

    /**
     * Set the value of RolloverForeground
     * @param rolloverForeground
     */
    public void setRolloverForeground(Color rolloverForeground) {
        this.rolloverForeground = rolloverForeground;
        paintMonthsPanel();
    }

    /**
     * Set the value of RolloverBorderColor
     * @param rolloverBorderColor
     */
    public void setRolloverBorderColor(Color rolloverBorderColor) {
        this.rolloverBorderColor = rolloverBorderColor;
        paintMonthsPanel();
    }

    /**
     * Set the alpha value for RolloverGradientColor2
     * @param gradientColor2Alpha
     */
    public void setGradientColor2Alpha(int gradientColor2Alpha) {
        this.gradientColor2Alpha = gradientColor2Alpha;
        paintMonthsPanel();
    }

    /**
     * Set the alpha value for RolloverGradientColor2
     * @param gradientColor1Alpha
     */
    public void setGradientColor1Alpha(int gradientColor1Alpha) {
        this.gradientColor1Alpha = gradientColor1Alpha;
        paintMonthsPanel();
    }

    /**
     * Gets the rollover gradient color 2
     * @return rolloverGradientColor2
     */
    public Color getRolloverGradientColor2() {
        return rolloverGradientColor2;
    }

    /**
     * Gets the rollover gradient color 1
     * @return rolloverGradientColor1
     */
    public Color getRolloverGradientColor1() {
        return rolloverGradientColor1;
    }

    /**
     * Gets the rollover foreground
     * @return rolloverForeground
     */
    public Color getRolloverForeground() {
        return rolloverForeground;
    }

    /**
     * Gets the rollover border color
     * @return rolloverBorderColor
     */
    public Color getRolloverBorderColor() {
        return rolloverBorderColor;
    }

    /**
     * Gets the alpha value for gradient2
     * @return alpha value of gradient2
     */
    public int getGradientColor2Alpha() {
        return gradientColor2Alpha;
    }

    /**
     * Gets the alpha value for gradient1
     * @return alpha value of gradient1
     */
    public int getGradientColor1Alpha() {
        return gradientColor1Alpha;
    }

    /**
     * Get the value of rolloverMonthIcon
     *
     * @return the value of rolloverMonthIcon
     */
    public Icon getRolloverMonthIcon() {
        return rolloverMonthIcon;
    }

    /**
     * Set the value of rolloverMonthIcon
     *
     * @param rolloverMonthIcon new value of rolloverMonthIcon
     */
    public void setRolloverMonthIcon(Icon rolloverMonthIcon) {
        this.rolloverMonthIcon = rolloverMonthIcon;
    }

    /**
     * Get the value of monthIcon
     *
     * @return the value of monthIcon
     */
    public Icon getMonthIcon() {
        return monthIcon;
    }

    /**
     * Set the value of monthIcon
     *
     * @param monthIcon new value of monthIcon
     */
    public void setMonthIcon(Icon monthIcon) {
        this.monthIcon = monthIcon;
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        if (componentInitialized) {
            paintMonthsPanel();
        }
    }

    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg);
        if (componentInitialized) {
            paintMonthsPanel();
        }
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        for (JButton button : monthBtns) {
            if (button != null) {
                button.setEnabled(enabled);
            }
        }
    }

    @Override
    public void setLocale(Locale l) {
        super.setLocale(l);
        this.locale = l;
        paintMonthsPanel();

    }

    // </editor-fold>
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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
    }// </editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /**
     * Initializes the button
     * @param button
     */
    private void initButton(DateButton button) {
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.TOP);
        button.setFont(getFont());
        button.setIconTextGap(1);
        button.setMargin(new Insets(2, 2, 2, 2));
        button.setOpaque(false);
        button.setForeground(getForeground());
        button.setBackground(getBackground());
        button.setIcon(monthIcon);
        button.setRolloverGradientColor2(rolloverGradientColor2);
        button.setRolloverGradientColor1(rolloverGradientColor1);
        button.setRolloverForeground(rolloverForeground);
        button.setRolloverBorderColor(rolloverBorderColor);
        button.setGradientColor2Alpha(gradientColor2Alpha);
        button.setGradientColor1Alpha(gradientColor1Alpha);
        button.setCyclicGradient(false);
    }

    /**
     * paints the month panel
     */
    private void paintMonthsPanel() {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        months = dateFormatSymbols.getShortMonths();
        for (int i = 0; i < 12; i++) {
            monthBtns[i].setText(months[i]);
            initButton(monthBtns[i]);
        }
    }

    public void actionPerformed(ActionEvent e) {
        int i;
        for (i = 0; i < 12; i++) {
            if (months[i].contentEquals(((JButton) e.getSource()).getText())) {
                break;
            }
        }
        setMonth(i);
    }

    @Override
    public void setFont(Font font) {
        super.setFont(font);
        if (componentInitialized) {
            paintMonthsPanel();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Main Method">
    public static void main(String[] s) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }
        javax.swing.JFrame frame = new javax.swing.JFrame("MonthsPanel");
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        MonthsPanel panel = new MonthsPanel();
        Image img = Toolkit.getDefaultToolkit().createImage(JCalendarConsts.class.getResource("resources/header.png"));
        //panel.setImage(img);
        panel.setRolloverGradientColor1(Color.BLUE);
        panel.setRolloverGradientColor2(Color.WHITE);
        panel.setGradientColor1Alpha(5);
        panel.setGradientColor2Alpha(100);
        panel.setRolloverForeground(Color.GREEN);
        panel.setRolloverBorderColor((Color.BLUE));
        //panel.setBackground(Color.red);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }// </editor-fold>
}
