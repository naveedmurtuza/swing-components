
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
package org.gpl.SwingComponents.JButtonMenuItem;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuItemUI;
import org.gpl.SwingComponents.JButtonMenuItem.Events.JButtonMenuItemListener;

/**
 * JButtonMenuItem is an extension of JMenItem with more than one button. Just like Google Chrome's Edit MenuItem.
 * This class fires a buttonClicked event.
 * Use as you wish, but an acknowledgement would be appreciated, ;) <br /><br />
 * @author Naveed Quadri
 */
public class JButtonMenuItem extends JMenuItem implements MouseListener, MouseMotionListener, ActionListener, ComponentListener, Serializable {

    private ButtonStyle buttonStyle;
    //private int _buttonStyle = 0;
    private int buttonSpacing = 16;
    /** The margin in the right of the button  */
    private int rightButtonMargin = 25;
    /** current active button. zero based */
    private int onButton = -1;
    /** Vector to hold buttons */
    private ArrayList<Rectangle> rectangles;
    private Rectangle buttonRect;
    private String actionCommand;
    protected JButtonMenuItemListener buttonMenuItemListener = null;
    protected Button[] buttons;
    private int iconSize;// = 16;

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a <code>JMenuItem</code> with the specified text and
     * keyboard mnemonic.
     *
     * @param text the text of the <code>JMenuItem</code>
     * @param mnemonic the keyboard mnemonic for the <code>JMenuItem</code>
     */
    public JButtonMenuItem(String text, int mnemonic) {
        this(text, null);
        setMnemonic(mnemonic);

    }

    /**
     * Creates a <code>JMenuItem</code> with the specified text and icon.
     *
     * @param text the text of the <code>JMenuItem</code>
     * @param icon the icon of the <code>JMenuItem</code>
     */
    public JButtonMenuItem(String text, Icon icon) {
        super(text, icon);
        init();
    }

    /**
     * Creates a <code>JMenuItem</code> with the specified text.
     *
     * @param text the text of the <code>JMenuItem</code>
     */
    public JButtonMenuItem(String text) {
        this(text, null);
    }

    /**
     * Creates a <code>JMenuItem</code> with the specified icon.
     *
     * @param icon the icon of the <code>JMenuItem</code>
     */
    public JButtonMenuItem(Icon icon) {
        this(null, icon);
    }

    /**
     * Creates a <code>JMenuItem</code> with no set text or icon.
     */
    public JButtonMenuItem() {
        this(null, null);
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Properties">
    /**
     * Get the value of buttonStyle
     * @return the value of buttonStyle
     */
    public ButtonStyle getButtonStyle() {
        if (buttonStyle == null) {
            buttonStyle = new ButtonStyle(this, ButtonStyle.ROUNDED_CORNERS);
        }
        return buttonStyle;
    }

    /**
     * Set the value for buttonStyle
     * @param buttonStyle
     */
    public void setButtonStyle(ButtonStyle buttonStyle) {
        this.buttonStyle = buttonStyle;
    }

    /**
     * Get the value of buttons
     *
     * @return the value of buttons
     */
    public Button[] getButtons() {
        return buttons;
    }

    /**
     * Set the value of buttons
     *
     * @param buttons new value of buttons
     */
    public void setButtons(Button[] buttons) {
        this.buttons = buttons;
        try
        {
            iconSize = new ImageIcon(buttons[0].getIcon()).getIconWidth();
        }
        catch(Exception ex)
        {
            iconSize = 16;
        }
    }

    /**
     * Returns the margin on the right side of the button. This is the amount of space between the button and the end of component.
     * @return Margin on the right of the button
     */
    public int getRightButtonMargin() {
        return rightButtonMargin;
    }

    /**
     * Sets the the amount of space between the button and the end of component.
     * @param rightButtonMargin the amount of space between the button and the end of component.
     */
    public void setRightButtonMargin(int rightButtonMargin) {
        this.rightButtonMargin = rightButtonMargin;
    }

    /**
     * Padding between two buttons.
     * @return button spacing
     */
    public int getButtonSpacing() {
        return buttonSpacing;
    }

    public void setButtonSpacing(int buttonSpacing) {
        this.buttonSpacing = buttonSpacing;
    }

    //</editor-fold>
    /**
     *Initializes the menu item
     */
    private void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addComponentListener(this);
        addActionListener(this);
        rectangles = new ArrayList<Rectangle>();
        //just an arbitrary size
        setPreferredSize(new Dimension(240, 35));
        setUI(new ButtonMenuItemUI(new Color(getBackground().getRGB()), new Color(getForeground().getRGB())));
    }

    /**
     * Returns the current x coordinate of the button's origin.
     * @return Returns the current x coordinate of the button's origin
     */
    private int getButtonX() {
        int width = getWidth();
        int buttonWidth = getButtonWidth();
        return width - buttonWidth - (rightButtonMargin / 2);
    }

    /**
     * Returns the height of the button
     * @return the height of the button
     */
    private int getButtonHeight() {
        return getHeight() - 4;
    }

    /**
     * The width of the button
     * @return The width of the button
     */
    private int getButtonWidth() {
        int strWidth = 0;
        int iconWidth = (buttons.length * buttonSpacing);
        String str = "";
        for (int i = 0; i < buttons.length; i++) {
            str += buttons[i].getButtonText();
        }
        strWidth += stringWidth(getGraphics(), str);
        switch (getButtonStyle().getImageOrText()) {
            case DISPLAY_ICON:
                return iconWidth + (buttons.length * iconSize);
            case DISPLAY_TEXT:
                return strWidth + (buttons.length * buttonSpacing);
            /*case DISPLAY_BOTH:
            return  (iconWidth + strWidth + (buttons.length * (iconSize + buttonSpacing)))
            ;//+ (strWidth + (buttons.length * buttonSpacing));*/
            default:
                return strWidth; //shud never come here
        }
    }

    @Override
    protected void paintBorder(Graphics g) {
        //super.paintBorder(g);
        //overridind the paintBorder method to hide the line Border
        //in metal laf
    }

    /**
     * This funtion draws image or text or both depending on the ImageTextRelation
     * @param g2d Graphics object
     * @param buttonIndex index of the button to draw on
     */
    private void drawImageOrText(Graphics2D g2d, int buttonIndex) {
        FontMetrics fm = g2d.getFontMetrics();
        int fontHeight = fm.getHeight();
        switch (getButtonStyle().getImageOrText()) {
            case DISPLAY_ICON:
                g2d.drawImage(buttons[buttonIndex].getIcon(), getButtonWidth(buttonIndex) / 4, getButtonHeight() / 4, null);
                break;
            case DISPLAY_TEXT:
                g2d.drawString(buttons[buttonIndex].getButtonText(), buttonSpacing / 2, (buttonRect.height / 2) + (fontHeight / 2));
                break;
            /*case DISPLAY_BOTH:
            g2d.drawImage(buttons[buttonIndex].getImage(), (buttonSpacing / 2) + stringWidth(g2d, buttons[buttonIndex].getButtonText()), getButtonHeight() / 4, null);
            g2d.drawString(buttons[buttonIndex].getButtonText(), buttonSpacing / 2, (buttonRect.height / 2) + (fontHeight / 2));
            break;*/

        }
    }

    /**
     * Gets the width of the Button on buttonIndex position
     * @param buttonIndex index of button to calculate the width for
     * @return width of the button on buttonIndex position
     */
    private int getButtonWidth(int buttonIndex) {
        switch (getButtonStyle().getImageOrText()) {
            case DISPLAY_TEXT:
                return stringWidth(getGraphics(), buttons[buttonIndex].getButtonText()) + buttonSpacing;
            case DISPLAY_ICON:
                return iconSize + buttonSpacing;
            /*case DISPLAY_BOTH:
                return stringWidth(getGraphics(), buttons[buttonIndex].getButtonText()) + iconSize + buttonSpacing;*/
            default:
                return stringWidth(getGraphics(), buttons[buttonIndex].getButtonText()) + buttonSpacing;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //draw only if buttons array is not empty!
        if (buttons != null) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Color oldColor = g2d.getColor();
            buttonRect = new Rectangle(getButtonX(), 2, getButtonWidth(), getButtonHeight());
            if (getButtonStyle().getBorder() == ButtonStyle.ROUNDED_CORNERS) {
                drawRoundedRectangle(g2d);
            } else if (getButtonStyle().getBorder() == ButtonStyle.RAISED) {
                drawRaisedRectangle(g2d);
            }

            if (onButton != -1) {
                g2d.setColor(getButtonStyle().getSelectionBackgroundColor());
                if (getButtonStyle().getBorder() == ButtonStyle.ROUNDED_CORNERS) {
                    drawSelectionRoundRect(g2d);
                } else if (getButtonStyle().getBorder() == ButtonStyle.RAISED) {
                    drawSelectionRaisedRectangle(g2d);
                }
            }

            g2d.translate(buttonRect.x, buttonRect.y);
            rectangles.add(0, new Rectangle(buttonRect.x, buttonRect.y, getButtonWidth(0), getButtonHeight()));
            g2d.setColor(onButton == 0 ? getButtonStyle().getSelectionForegroundColor() : getForeground());
            drawImageOrText(g2d, 0);
            for (int i = 1; i < buttons.length; i++) {
                g2d.translate(rectangles.get(i - 1).width, 0);
                g2d.setColor(getBackground().darker().darker());
                g2d.drawLine(0, 4, 0, getButtonHeight() - 4);
                rectangles.add(i, new Rectangle(rectangles.get(i - 1).x + rectangles.get(i - 1).width, buttonRect.y, getButtonWidth(i), getButtonHeight()));
                g2d.setColor(onButton == i ? getButtonStyle().getSelectionForegroundColor() : getForeground());
                drawImageOrText(g2d, i);
            }

            g2d.setColor(oldColor);
        }
    }

    /**
     * Draws a Rounded Rectangle
     * @param g2d Graphics Object
     */
    private void drawRoundedRectangle(Graphics2D g2d) {
        g2d.setColor(getBackground().darker().darker());
        g2d.draw(new RoundRectangle2D.Float(buttonRect.x, buttonRect.y, buttonRect.width, buttonRect.height, getButtonStyle().getArcWidth(), getButtonStyle().getArcHeight()));

    }

    /**
     * Draws a raised Rectangle
     * @param g2d Graphics Object
     */
    private void drawRaisedRectangle(Graphics2D g2d) {
        g2d.translate(buttonRect.x, buttonRect.y);

        //directly plagarized from java source for softbevelborder
        g2d.setColor(getButtonStyle().getHighlightOuterColor());
        g2d.drawLine(0, 0, buttonRect.width - 2, 0);
        g2d.drawLine(0, 0, 0, buttonRect.height - 2);
        g2d.drawLine(1, 1, 1, 1);

        g2d.setColor(getButtonStyle().getHighlightInnerColor());
        g2d.drawLine(2, 1, buttonRect.width - 2, 1);
        g2d.drawLine(1, 2, 1, buttonRect.height - 2);
        g2d.drawLine(2, 2, 2, 2);
        g2d.drawLine(0, buttonRect.height - 1, 0, buttonRect.height - 2);
        g2d.drawLine(buttonRect.width - 1, 0, buttonRect.width - 1, 0);

        g2d.setColor(getButtonStyle().getShadowOuterColor());
        g2d.drawLine(2, buttonRect.height - 1, buttonRect.width - 1, buttonRect.height - 1);
        g2d.drawLine(buttonRect.width - 1, 2, buttonRect.width - 1, buttonRect.height - 1);

        g2d.setColor(getButtonStyle().getShadowInnerColor());
        g2d.drawLine(buttonRect.width - 2, buttonRect.height - 2, buttonRect.width - 2, buttonRect.height - 2);
        g2d.translate(-buttonRect.x, -buttonRect.y);
    }

    private void drawSelectionRoundRect(Graphics2D g2d) {
        Shape rectShape = null;
        Rectangle filler;

        if (onButton == 0) {
            rectShape = new RoundRectangle2D.Float(rectangles.get(onButton).x, rectangles.get(onButton).y, rectangles.get(onButton).width, rectangles.get(onButton).height, getButtonStyle().getArcWidth(), getButtonStyle().getArcHeight());
            if (buttons.length != 1) {
                filler = new Rectangle(rectangles.get(onButton).x + rectangles.get(onButton).width - 10, rectangles.get(onButton).y, 10, rectangles.get(onButton).height);
                g2d.fill(filler);
            }
        } else if (onButton == buttons.length - 1) {
            rectShape = new RoundRectangle2D.Float(rectangles.get(onButton).x, rectangles.get(onButton).y, rectangles.get(onButton).width, rectangles.get(onButton).height, getButtonStyle().getArcWidth(), getButtonStyle().getArcHeight());
            filler = new Rectangle(rectangles.get(onButton).x + 1, rectangles.get(onButton).y, 10, rectangles.get(onButton).height);
            g2d.fill(filler);
        } else {
            rectShape = new Rectangle(rectangles.get(onButton).x + 1, rectangles.get(onButton).y, rectangles.get(onButton).width - 1, rectangles.get(onButton).height);
        }

        g2d.fill(rectShape);
    }

    private void drawSelectionRaisedRectangle(Graphics2D g2d) {
        Shape s = rectangles.get(onButton);
        if (onButton != 0) {
            s = new Rectangle(rectangles.get(onButton).x + 2, rectangles.get(onButton).y,
                    rectangles.get(onButton).width - 2, rectangles.get(onButton).height);
        }
        g2d.fill(s);
    }

    private int stringWidth(Graphics g, String str) {
        FontMetrics fm = g.getFontMetrics();
        return fm.stringWidth(str);
    }

    /**
     * Adds a <code>MenuDragMouseListener</code> to the menu item.
     *
     * @param l the <code>MenuDragMouseListener</code> to be added
     */
    public void addJButtonMenuItemListener(JButtonMenuItemListener l) {
        listenerList.add(JButtonMenuItemListener.class, l);
    }

    /**
     * Removes a <code>MenuDragMouseListener</code> from the menu item.
     *
     * @param l the <code>MenuDragMouseListener</code> to be removed
     */
    public void removeJButtonMenuItemListener(JButtonMenuItemListener l) {
        listenerList.remove(JButtonMenuItemListener.class, l);
    }

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuKeyEvent</code>
     */
    protected void fireButtonClicked(ActionEvent event) {
        //directly plagarized from java source!
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        ActionEvent e = null;
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == JButtonMenuItemListener.class) {
                // Lazily create the event:
                if (e == null) {

                    if (actionCommand == null) {
                        actionCommand = getText();
                    }
                    e = new ActionEvent(JButtonMenuItem.this,
                            ActionEvent.ACTION_PERFORMED,
                            actionCommand,
                            event.getWhen(),
                            event.getModifiers());
                }
                ((JButtonMenuItemListener) listeners[i + 1]).buttonClicked(e);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Unused Mouse events">
    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }
// </editor-fold>

    /**
     * 
     * @param e
     */
    public void mouseExited(MouseEvent e) {
        onButton = -1;
        actionCommand = getText();
        //repaint(buttonRect);
        repaint();
    }

    /**
     * 
     * @param e
     */
    public void mouseMoved(MouseEvent e) {
        if (buttons != null) {
            if (buttonRect.contains(e.getPoint())) {
                for (int i = 0; i < buttons.length; i++) {
                    //System.out.println(rectangles[i].x + " , " + rectangles[i].y + " , " + rectangles[i].width + " , " + rectangles[i].height);
                    if (rectangles.get(i).contains(e.getPoint())) {
                        onButton = i;
                        actionCommand = buttons[i].getButtonText() != null ? buttons[i].getButtonText() : buttons[i].getTooltipText() != null ? buttons[i].getTooltipText() : "BUTTON_" + i;
                        setToolTipText(buttons[i].getTooltipText());
                        break;
                    }
                }
            } else {
                setToolTipText(null);
                onButton = -1;
                actionCommand = getText();
            }
            repaint(buttonRect);
        }
    }

    /**
     * 
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        fireButtonClicked(e);
        onButton = -1;
        actionCommand = getText();
    }

    public void componentResized(ComponentEvent e) {
        e.getComponent().repaint();
    }

    public void componentMoved(ComponentEvent e) {
        //e.getComponent().repaint();
    }

    public void componentShown(ComponentEvent e) {
        //e.getComponent().repaint();
    }

    public void componentHidden(ComponentEvent e) {
        e.getComponent().repaint();
    }

    /**
     *
     */
    class ButtonMenuItemUI extends BasicMenuItemUI {

        /**
         *
         * @param selBackColor
         * @param selForeColor
         */
        public ButtonMenuItemUI(Color selBackColor, Color selForeColor) {
            selectionBackground = selBackColor;
            selectionForeground = selForeColor;

        }
    }
}
