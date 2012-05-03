
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
package org.gpl.SwingComponents.JCheckboxList;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

/**
 * An implementation of JCheckboxList, a JList with checkboxes
 * @author Naveed Quadri
 */
public class JCheckBoxList extends JList {

    public JCheckBoxList() {
        super();
        setModel(new DefaultListModel());
        setCellRenderer(new CheckboxCellRenderer());

        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                int index = locationToIndex(e.getPoint());
                Rectangle bounds = getCellBounds(index, index);
                if (index != -1) {
                    Object obj = getModel().getElementAt(index);
                    if (obj instanceof JCheckBox) {
                        JCheckBox checkbox = (JCheckBox) obj;
                        //check if the click is on checkbox (including the label)
                        boolean inCheckbox = getComponentOrientation().isLeftToRight() ? e.getX() < bounds.x + checkbox.getPreferredSize().getWidth() : e.getX() > bounds.x + checkbox.getPreferredSize().getWidth();
                        //change the state of the checkbox on double click or if the click is on checkbox (including the label)
                        if (e.getClickCount() >= 2 || inCheckbox) {
                            checkbox.setSelected(!checkbox.isSelected());
                            fireSelectionValueChanged(index, index, inCheckbox);
                        }
                        repaint();
                    }
                }
            }
        });

        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * Gets all the indices that are checked.
     * @return Checked Indices
     */
    public int[] getCheckedIndices() {
        java.util.List list = new java.util.ArrayList();
        DefaultListModel dlm = (DefaultListModel) getModel();
        for (int i = 0; i < dlm.size(); ++i) {
            Object obj = getModel().getElementAt(i);
            if (obj instanceof JCheckBox) {
                JCheckBox checkbox = (JCheckBox) obj;
                if (checkbox.isSelected()) {
                    list.add(new Integer(i));
                }
            }
        }

        int[] indexes = new int[list.size()];

        for (int i = 0; i < list.size(); ++i) {
            indexes[i] = ((Integer) list.get(i)).intValue();
        }

        return indexes;
    }

    /**
     * Gets Checked Items
     * @return Checked Items
     */
    public ArrayList<CheckBoxListItem> getCheckedItems() {
        ArrayList<CheckBoxListItem> list = new ArrayList<CheckBoxListItem>();
        DefaultListModel dlm = (DefaultListModel) getModel();
        for (int i = 0; i < dlm.size(); ++i) {
            Object obj = getModel().getElementAt(i);
            if (obj instanceof CheckBoxListItem) {
                CheckBoxListItem checkboxListItem = (CheckBoxListItem) obj;
                if (checkboxListItem.isSelected()) {
                    list.add(checkboxListItem);
                }
            }
        }
        return list;
    }
}
