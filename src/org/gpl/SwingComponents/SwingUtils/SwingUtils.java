
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
package org.gpl.SwingComponents.SwingUtils;

import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 * A collection of utility methods for Swing.
 * @author Naveed Quadri
 */
public class SwingUtils {

    /**
     * Scrolls the cell (rowIndex, vColIndex) so that it is visible within the viewport.(code snippet from exampledepot)
     * @param table the jtable to work on
     * @param rowIndex the row index of the cell
     * @param vColIndex the column index of the cell
     */
    public static void scrollToVisible(final JTable table, int rowIndex, int vColIndex) {
        if (!(table.getParent() instanceof JViewport)) {
            return;
        }
        JViewport viewport = (JViewport) table.getParent();

        // This rectangle is relative to the table where the
        // northwest corner of cell (0,0) is always (0,0).
        Rectangle rect = table.getCellRect(rowIndex, vColIndex, true);

        // The location of the viewport relative to the table
        Point pt = viewport.getViewPosition();

        // Translate the cell location so that it is relative
        // to the view, assuming the northwest corner of the
        // view is (0,0)
        rect.setLocation(rect.x - pt.x, rect.y - pt.y);

        // Scroll the area into view
        viewport.scrollRectToVisible(rect);
    }

    /**
     * Gets a strike through font 
     * @param font font to convert to strike through
     * @return  strike through font 
     */
    public static Font getStrikeThroughFont(Font font) {
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
        return new Font(attributes);
    }


    /**
     * Moves an item in the list upward
     * @param list the JList 
     * @param index the index of the item. The new position of the item will be index - 1
     */
    public static void moveListItemUp(JList list,int index)
    {
        Object item = ((DefaultListModel)list.getModel()).remove(index);
        ((DefaultListModel)list.getModel()).add(index - 1, item);
        list.setSelectedIndex(index - 1);
    }

    /**
     * Moves an item in the list down
     * @param list the JList 
     * @param index the index of the item. The new position of the item will be index + 1
     */
     public static void moveListItemDown(JList list,int index)
    {
        Object item = ((DefaultListModel)list.getModel()).remove(index);
        ((DefaultListModel)list.getModel()).add(index + 1, item);
        list.setSelectedIndex(index + 1);
    }
     
    public static void removeRow(final JTable table, final int row) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                ((DefaultTableModel) table.getModel()).removeRow(row);
            }
        });
    }
}
