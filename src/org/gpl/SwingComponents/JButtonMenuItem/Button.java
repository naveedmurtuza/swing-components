
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

import java.awt.Image;
import java.io.Serializable;

public class Button implements Serializable {

    private String buttonText;
    private Image icon;
    private String TooltipText;

    /**
     * Creates a button for <code>JButtonMenuItem</code> with the specified buttonText,TooltipText and icon
     * @param buttonText the text of the button
     * @param TooltipText the tooltip of the button
     * @param icon the icon of the button
     */
    public Button(String buttonText, String TooltipText, Image icon) {
        this.buttonText = buttonText;
        this.TooltipText = TooltipText;
        this.icon = icon;
    }

    /**
     * Creates a button for <code>JButtonMenuItem</code> with the specified buttonText
     * @param buttonText the text of the button
     */
    public Button(String buttonText) {
        this.buttonText = buttonText;
    }

    /**
     *  Creates a button for <code>JButtonMenuItem</code> with the specified icon
     * @param icon the icon of the button
     */
    public Button(Image icon) {
        this.icon = icon;
    }

    /**
     * 
     * @param TooltipText
     * @param icon
     */
    public Button(String TooltipText, Image icon) {
        this.TooltipText = TooltipText;
        this.icon = icon;
    }

    /**
     * Get the value of buttonText
     *
     * @return the value of buttonText
     */
    public String getButtonText() {
        return buttonText;
    }

    /**
     * Get the value of icon
     *
     * @return the value of icon
     */
    public Image getIcon() {
        return icon;
    }

    /**
     * Get the value of TooltipText
     *
     * @return the value of TooltipText
     */
    public String getTooltipText() {
        return TooltipText;
    }
}
