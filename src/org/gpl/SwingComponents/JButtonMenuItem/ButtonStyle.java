
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

import java.awt.Color;
import java.io.Serializable;
import javax.swing.UIManager;

public class ButtonStyle implements Serializable {

    public enum ImageOrText {
        DISPLAY_TEXT,
        DISPLAY_ICON
    };
    
    public static final int ROUNDED_CORNERS = 0;
    /** Raised bevel type. */
    public static final int RAISED = 1;
    /** the width of the arc to use to round off the corners (used only for rounded_corners button) */
    protected int arcWidth;// = 10;
    /** the height of the arc to use to round off the corners (used only for rounded_corners button) */
    protected int arcHeight;// = 10;
    /** border color used when rounded_corner button style is used*/
    protected Color borderColor;
    protected int border = ROUNDED_CORNERS;
    protected Color highlightOuterColor;
    protected Color selectionBackgroundColor;
    protected Color selectionForegroundColor;
    protected Color highlightInnerColor;
    protected Color shadowInnerColor;
    protected Color shadowOuterColor;
    protected JButtonMenuItem mi;
    protected ImageOrText imageOrText = ImageOrText.DISPLAY_TEXT;

    public ButtonStyle(JButtonMenuItem mi, int buttonStyle) {
        this(mi, buttonStyle, ImageOrText.DISPLAY_TEXT);
    }

    public ButtonStyle(JButtonMenuItem mi, int buttonStyle, ImageOrText imageOrText) {
        this(mi, buttonStyle, imageOrText,
                null,//selectionBackgroundColor
                null,//selectionForegroundColor
                20,//arcWidth
                20,//arcHeight
                null,//borderColor
                null,//highlightOuterColor
                null,//highlightInnerColor
                null,//shadowOuterColor
                null//shadowInnerColor
                );

    }

    public ButtonStyle(JButtonMenuItem mi, ImageOrText imageOrText, Color selectionBackgroundColor, Color selectionForegroundColor, int arcWidth, int arcHeight, Color borderColor) {
        this(mi, ROUNDED_CORNERS, imageOrText, selectionBackgroundColor, selectionForegroundColor, arcWidth, arcHeight, borderColor, null, null, null, null);
    }

    public ButtonStyle(JButtonMenuItem mi, ImageOrText imageOrText, Color selectionBackgroundColor, Color selectionForegroundColor, Color highlightOuterColor, Color highlightInnerColor, Color shadowInnerColor, Color shadowOuterColor) {
        this(mi, RAISED, imageOrText, selectionBackgroundColor, selectionForegroundColor, 0, 0, null, highlightOuterColor, highlightInnerColor, shadowOuterColor, shadowInnerColor);

    }

    private ButtonStyle(JButtonMenuItem mi, int buttonStyle, ImageOrText imageOrText, Color selectionBackgroundColor, Color selectionForegroundColor, int arcWidth, int arcHeight, Color borderColor, Color highlightOuterColor, Color highlightInnerColor, Color shadowOuterColor, Color shadowInnerColor) {
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        this.borderColor = borderColor;
        this.highlightOuterColor = highlightOuterColor;
        this.selectionBackgroundColor = selectionBackgroundColor;
        this.selectionForegroundColor = selectionForegroundColor;
        this.highlightInnerColor = highlightInnerColor;
        this.shadowInnerColor = shadowInnerColor;
        this.shadowOuterColor = shadowOuterColor;
        this.mi = mi;
        this.border = buttonStyle;
        this.imageOrText = imageOrText;
        if (this.selectionBackgroundColor == null) {
            try {
                this.selectionBackgroundColor = new Color(UIManager.getLookAndFeelDefaults().getColor("MenuItem.selectionBackground").getRGB());
            } catch (Exception e) {
                this.selectionBackgroundColor = new Color(UIManager.getLookAndFeelDefaults().getColor("MenuItem.background").getRGB());
            }
        }
        if (this.selectionForegroundColor == null) {
            try {

                this.selectionForegroundColor = new Color(UIManager.getLookAndFeelDefaults().getColor("MenuItem.selectionForeground").getRGB());
            } catch (Exception ex) {

                this.selectionForegroundColor = new Color(UIManager.getLookAndFeelDefaults().getColor("MenuItem.foreground").getRGB());
            }
        }
    }

    /**
     * Get the value of imageOrText
     *
     * @return the value of imageOrText
     */
    public ImageOrText getImageOrText() {
        return imageOrText;
    }

    /**
     * Get the value of shadowOuterColor
     *
     * @return the value of shadowOuterColor
     */
    public Color getShadowOuterColor() {
        return shadowOuterColor != null ? shadowOuterColor : mi.getBackground().darker().darker();
    }

    /**
     * Get the value of shadowInnerColor
     *
     * @return the value of shadowInnerColor
     */
    public Color getShadowInnerColor() {
        return shadowInnerColor != null ? shadowInnerColor : mi.getBackground().darker();
    }

    /**
     * Get the value of highlightInnerColor
     *
     * @return the value of highlightInnerColor
     */
    public Color getHighlightInnerColor() {
        return highlightInnerColor != null ? highlightInnerColor : mi.getBackground().brighter();
    }

    /**
     * Get the value of highlightOuterColor
     *
     * @return the value of highlightOuterColor
     */
    public Color getHighlightOuterColor() {
        return highlightOuterColor != null ? highlightOuterColor : mi.getBackground().brighter().brighter();
    }

    /**
     * Get the value of borderColor
     *
     * @return the value of borderColor
     */
    public Color getBorderColor() {
        return borderColor != null ? borderColor : mi.getBackground().darker().darker();
    }

    /**
     * Get the value of selectionForegroundColor
     *
     * @return the value of selectionForegroundColor
     */
    public Color getSelectionForegroundColor() {
        return selectionForegroundColor;
    }

    /**
     * Get the value of selectionBackgroundColor
     *
     * @return the value of selectionBackgroundColor
     */
    public Color getSelectionBackgroundColor() {
        return selectionBackgroundColor;
    }

    /**
     * Get the value of arcHeight
     *
     * @return the value of arcHeight
     */
    public int getArcHeight() {
        return arcHeight;
    }

    /**
     * Get the value of arcWidth
     *
     * @return the value of arcWidth
     */
    public int getArcWidth() {
        return arcWidth;
    }

    /**
     * 
     * @return the border. Will be one of <code>ButtonStyle.ROUNDED_CORNERS</code> or
     * <code>ButtonStyle.RAISED</code>
     */
    public int getBorder() {
        return border;
    }
}
