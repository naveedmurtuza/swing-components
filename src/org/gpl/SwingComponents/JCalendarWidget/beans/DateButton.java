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

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

/**
 * An implementation of JButton with gradient rollover
 * @author Naveed Quadri
 * @version 1.0
 */
public class DateButton extends JButton {

    private Color _rolloverGradientColor1;
    private Color rolloverGradientColor1;
    private int gradientColor1Alpha;
    private Color _rolloverGradientColor2;
    private Color rolloverGradientColor2;
    private int gradientColor2Alpha;
    private Color rolloverBorderColor;
    private Color rolloverForeground;
    private Color oldFg;
    private boolean cyclicGradient;
    private boolean selected;

    /**
     * Creates a button with no set text or icon.
     */
    public DateButton() {
        this(null, null);
    }

    /**
     * Creates a button with text.
     *
     * @param text  the text of the button
     */
    public DateButton(String text) {
        this(text, null);
    }

    /**
     * Creates a button with initial text and an icon.
     *
     * @param text  the text of the button
     * @param icon  the Icon image to display on the button
     */
    public DateButton(String text, Icon icon) {
        super(text, icon);
        init();
    }


    /**
     * creates a button with no set initial text and icon. A non focusable button will not
     * respond to rollover.
     * @param focusable whether the button is focusable or not
     */
    DateButton(boolean focusable) {
        setFocusable(focusable);
        init();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSelected() {
        return selected;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg);
    }

    /**
     * Parameter for <code>GradientPaint</code>
     * @return true if cyclicGradient false otherwise
     */
    public boolean isCyclicGradient() {
        return cyclicGradient;
    }

    /**
     * Parameter for <code>GradientPaint</code>
     * @param cyclicGradient true for cyclicGradient false otherwise
     */
    public void setCyclicGradient(boolean cyclicGradient) {
        this.cyclicGradient = cyclicGradient;
    }

    /**
     * Color1 of the two colors required for GradientPaint
     *
     * @return the value of rolloverGradientColor1
     */
    public Color getRolloverGradientColor1() {
        return rolloverGradientColor1;
    }

    /**
     * Set the Color1, of the two colors required for GradientPaint
     *
     * @param rolloverGradientColor1 new value of rolloverGradientColor1
     */
    public void setRolloverGradientColor1(Color rolloverGradientColor1) {
        this.rolloverGradientColor1 = rolloverGradientColor1;
    }

    /**
     * Color2 of the two colors required for GradientPaint
     *
     * @return the value of rolloverGradientColor2
     */
    public Color getRolloverGradientColor2() {
        return rolloverGradientColor2;
    }

    /**
     * Set Color2 of the two colors required for GradientPaint
     *
     * @param rolloverGradientColor2 new value of rolloverGradientColor2
     */
    public void setRolloverGradientColor2(Color rolloverGradientColor2) {
        this.rolloverGradientColor2 = rolloverGradientColor2;
    }

    /**
     * Gets the alpha value for Color1 of the GradientPaint
     * @return gradientColor1Alpha the alpha value for Color1 of the GradientPaint
     */
    public int getGradientColor1Alpha() {
        return gradientColor1Alpha;
    }

    /**
     * Sets the alpha value for Color1 of the GradientPaint
     * @param gradientColor1Alpha the alpha value for Color1 of the GradientPaint
     */
    public void setGradientColor1Alpha(int gradientColor1Alpha) {
        this.gradientColor1Alpha = gradientColor1Alpha;
    }

    /**
     * Gets the alpha value for Color1 of the GradientPaint
     * @return the alpha value for Color2 of the GradientPaint
     */
    public int getGradientColor2Alpha() {
        return gradientColor2Alpha;
    }

    /**
     * Sets the alpha value for Color2 of the GradientPaint
     * @param gradientColor2Alpha the alpha value for Color1 of the GradientPaint
     */
    public void setGradientColor2Alpha(int gradientColor2Alpha) {
        this.gradientColor2Alpha = gradientColor2Alpha;
    }

    /**
     * Gets the color used in creating a LineBorder around the button on rollover
     * @return the color used in creating a LineBorder around the button on rollover
     */
    public Color getRolloverBorderColor() {
        return rolloverBorderColor;
    }

    /**
     * Sets the color used in creating a LineBorder around the button on rollover
     * @param rolloverBorderColor the color used in creating a LineBorder around the button on rollover
     */
    public void setRolloverBorderColor(Color rolloverBorderColor) {
        this.rolloverBorderColor = rolloverBorderColor;
    }

    /**
     * Gets the foreground color of this button on rollover
     * @return this button's foreground color on rollover
     */
    public Color getRolloverForeground() {
        return rolloverForeground;
    }

    /**
     * Sets the foreground color of this button on rollover
     * @param rolloverForeground the color to become this button's foreground color o rollover
     */
    public void setRolloverForeground(Color rolloverForeground) {
        this.rolloverForeground = rolloverForeground;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.isRolloverEnabled() || !this.isFocusable()) {
            return;
        }
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Color oldColor = g2d.getColor();
        if (rolloverGradientColor1 != null && _rolloverGradientColor1 == null) {
            _rolloverGradientColor1 = new Color(
                    rolloverGradientColor1.getRed(),
                    rolloverGradientColor1.getGreen(),
                    rolloverGradientColor1.getBlue(),
                    gradientColor1Alpha);
        }
        if (rolloverGradientColor2 != null && _rolloverGradientColor2 == null) {
            _rolloverGradientColor2 = new Color(
                    rolloverGradientColor2.getRed(),
                    rolloverGradientColor2.getGreen(),
                    rolloverGradientColor2.getBlue(),
                    gradientColor2Alpha);
        }

        Shape shape = new RoundRectangle2D.Float(1, 1, getWidth() - 2, getHeight() - 2, 5, 5);
        if (getModel().isRollover() || getModel().isPressed()) {
            rollover(g2d, shape, getModel().isPressed());
        }
        g2d.setColor(oldColor);
    }

    /**
     * Initializes the button.
     */
    private void init() {
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                if(!isFocusable() || !isRolloverEnabled())
                    return;
                if (isFocusable() && !isSelected()) {
                    oldFg = getForeground();
                    setForeground(rolloverForeground);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(!isFocusable() || !isRolloverEnabled())
                    return;
                if (!isSelected()) {
                   setForeground(oldFg);
                }
            }
        });

    }

    /**
     * 
     * @param g2d Graphics2D object
     * @param shape
     * @param isPressed
     */
    private void rollover(Graphics2D g2d, Shape shape, boolean isPressed) {
        if (rolloverBorderColor != null) {
            g2d.setColor(rolloverBorderColor);
            g2d.setStroke(new BasicStroke(1));
            g2d.draw(shape);
        }
        if (_rolloverGradientColor1 != null && _rolloverGradientColor2 != null) {
            GradientPaint gradient = new GradientPaint(0, 0,
                    _rolloverGradientColor1,
                    getWidth(),
                    getHeight(),
                    _rolloverGradientColor2,
                    cyclicGradient);
            g2d.setPaint(gradient);
            g2d.fill(shape);
            if (isPressed) {
                setForeground(oldFg);
            } else if (getModel().isRollover()) {
                //setForeground(rolloverForeground);
            } else {
            }
        }
    }

    /**
     * Sets the background and foreground color of the button 
     * @param background the background color of the button
     * @param foreground the foreground color of the button
     */
    public void setDecorations(Color background, Color foreground) {
        setDecorations(background, foreground, javax.swing.BorderFactory.createEmptyBorder());
    }

    /**
     * 
     * @param b
     * @param focusable
     */
    public void setEnabled(boolean b, boolean focusable) {
        setVisible(true);
        setFocusable(focusable);
        setEnabled(b);
    }

    /**
     * 
     * @param backgroundColor
     * @param foregroundColor
     * @param border
     */
    public void setDecorations(Color backgroundColor, Color foregroundColor, Border border) {
        setBackground(backgroundColor);
        setForeground(foregroundColor);
        setBorder(border);
    }

    /**
     * Test
     * @param args
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        DateButton button = new DateButton("TEST");
        button.setForeground(Color.RED);
        button.setRolloverGradientColor1(Color.BLUE);
        button.setRolloverGradientColor2(Color.WHITE);
        button.setGradientColor2Alpha(5);
        button.setGradientColor1Alpha(50);
        button.setRolloverForeground(Color.CYAN);
        button.setRolloverEnabled(false);
        f.getContentPane().add(button);
        f.setVisible(true);
        button.repaint();
    }
}
