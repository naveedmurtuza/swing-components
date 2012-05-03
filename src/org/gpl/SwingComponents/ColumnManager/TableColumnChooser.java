
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

package org.gpl.SwingComponents.ColumnManager;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.table.*;
import org.gpl.SwingComponents.ColumnManager.ChooseColumnsDlg.Direction;

/**
 * TableColumnChooser class allows to show/hide columns, resize columns, arrange columns graphically like
 * the M$ Windows Explorer style.
 *<br />
 * To use this just instantiate the class and call install method.
 * <code>
 * TableColumnChooser tableColumnChooser = new TableColumnChooser(jTable.getTableHeader());
   tableColumnChooser.install();
 * </code>
 * @version 1.0
 * @author Naveed Quadri
 */
public class TableColumnChooser implements MouseListener, ItemListener {

    private final JTableHeader header;
    private final JTable table;
    private ArrayList<TableColumn> hiddenColumns;
    private JPopupMenu popupMenu;
    private ChooseColumnsDlg chooseColDlg;

    /**
     * Constructs a  TableColumnChooser
     * @param header the table header
     */
    public TableColumnChooser(JTableHeader header) {
        this.header = header;
        table = header.getTable();
    }

    /**
     * Installs the TableColumnChooser on the specified table. Call this method after creating the table.
     */
    public void install() {
        header.addMouseListener(this);
        hiddenColumns = new ArrayList<TableColumn>();
        popupMenu = new JPopupMenu();
        chooseColDlg = new ChooseColumnsDlg(null, true, this);
        buildPopup();
    }

    /**
     * Uninstalls the TableColumnChooser
     */
    public void uninstall() {
        header.removeMouseListener(this);
        popupMenu = null;
        chooseColDlg = null;
    }

    public void mouseClicked(MouseEvent e) {
    }

    /**
     * The mouse pressed event to show the popup
     * @param e the mouse event
     */
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popupMenu.show(header, e.getX(), e.getY());
        }
    }

    /**
     * The mouse pressed event to show the popup
     * @param e the mouse event
     */
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popupMenu.show(header, e.getX(), e.getY());
        }
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    /**
     * Toggles the visibility of the column based on the visibilty parameter
     * @param identifier the column name
     * @param visibilty true to show the column, false to hide it
     */
    public void toggleColumnVisibility(String identifier, boolean visibilty) {
        for (MenuElement me : popupMenu.getSubElements()) {
            if (me instanceof JCheckBoxMenuItem) {
                JCheckBoxMenuItem cbmi = (JCheckBoxMenuItem) me;
                if (cbmi.getText().contentEquals(identifier)) {
                    cbmi.setSelected(visibilty);
                    break;
                }
            }
        }
    }

    
    private void showColumn(String identifier) {
        if (hiddenColumns.isEmpty()) {
            return;
        }
        for (TableColumn col : hiddenColumns) {
            if (col.getIdentifier().toString().contentEquals(identifier)) {
                table.addColumn(col);
                hiddenColumns.remove(col);
                break;
            }
        }
    }

    
    private void hideColumn(String identifier) {
        try {

            TableColumn column = table.getColumn(identifier);
            table.removeColumn(column);
            hiddenColumns.add(column);
            //update checkbox
        } catch (IllegalArgumentException iae) {
            //ignore, not a good idea tho
        }
    }

    /**
     * Gets the visiblity of the column
     * @param identifier the column name
     * @return true if the column is visible, false otherwise
     */
    public boolean IsColumnVisible(String identifier) {
        boolean visible = false;
        TableColumnModel model = table.getColumnModel();
        Enumeration<TableColumn> e = model.getColumns();
        TableColumn col;
        while (e.hasMoreElements()) {
            col = e.nextElement();
            if (col.getHeaderValue().toString().contentEquals(identifier)) {
                visible = true;
                break;
            }
        }
        return visible;

    }

    /**
     *
     * @param e
     */
    public void itemStateChanged(ItemEvent e) {
        JCheckBoxMenuItem cbmi = (JCheckBoxMenuItem) e.getSource();
        String identifier = cbmi.getText();
        if (e.getStateChange() == ItemEvent.SELECTED) {
            showColumn(identifier);
        } else {
            hideColumn(identifier);
        }
    }

    /**
     * Builds the popup, populates it with column names and register for the action events
     */
    private void buildPopup() {
        //  FileViewerTable table = (FileViewerTable) header.getTable();
        popupMenu.add(new JMenuItem(new AbstractAction("Size Column to Fit") {

            public void actionPerformed(ActionEvent e) {
                sizeColumnToFitActionPerfromed(e);
            }
        }));
        popupMenu.add(new AbstractAction("Size All Columns to Fit") {

            public void actionPerformed(ActionEvent e) {
                sizeAllColumnsToFitActionPerfromed(e);
            }
        });
        popupMenu.add(new JSeparator());

        TableColumnModel columnModel = header.getColumnModel();

        TableColumn col;
        String colHeader;
        String[] cols = new String[columnModel.getColumnCount()];
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            col = columnModel.getColumn(i);
            colHeader = col.getHeaderValue().toString();
            cols[i] = colHeader;
            addToPopup(colHeader);
        }
        chooseColDlg.setColumns(cols);
        popupMenu.add(new JSeparator());
        popupMenu.add(new JMenuItem(new AbstractAction("More ...") {

            public void actionPerformed(ActionEvent e) {
                moreActionPerformed(e);
            }
        }));
    }

    /**
     * Displays the <code>ChooseColumnsDlg</code> Dialog
     * @param e
     */
    private void moreActionPerformed(ActionEvent e) {
        chooseColDlg.setVisible(true);
    }

    /**
     *
     * @param e
     */
    private void sizeColumnToFitActionPerfromed(ActionEvent e) {
        table.getSelectedColumn();
        Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
        SwingUtilities.convertPointFromScreen(mouseLocation, table);
        int colIndex = table.getColumnModel().getColumnIndexAtX(mouseLocation.x);
        packColumn(colIndex, 2);
    }

    /**
     *
     * @param e
     */
    private void sizeAllColumnsToFitActionPerfromed(ActionEvent e) {
        packAll();
    }

    /**
     * 
     */
    public void packAll()
    {
        for (int c = 0; c < table.getColumnCount(); c++) {
            //if(IsColumnVisible(c))
            packColumn(c, 2);
        }
    }
    /**
     *
     * @param colHeader
     */
    private void addToPopup(String colHeader) {
        JCheckBoxMenuItem menuItem;
        menuItem = new JCheckBoxMenuItem(colHeader);
        menuItem.setSelected(true);
        menuItem.addItemListener(this);
        popupMenu.add(menuItem);
    }

    /**
     *
     * @param identifier
     * @param direction
     */
    public void moveColumn(String identifier, Direction direction) {
        int ColViewIndex = (table.getColumnModel().getColumnIndex(identifier));
        table.moveColumn(ColViewIndex, ColViewIndex + 1);
    }

    /**
     * Hides all the columns
     */
    public void hideAllColumns() {
        TableColumnModel columnModel = table.getColumnModel();
        String identifier;
        for (int i = columnModel.getColumnCount() - 1; i >= 0; i--) {
            identifier = columnModel.getColumn(i).getIdentifier().toString();
            if (IsColumnVisible(identifier)) {
                toggleColumnVisibility(identifier, false);
            }
        }

    }

    /**
     *Shows all the columns
     */
    public void showAllColumns() {
        TableColumnModel columnModel = table.getColumnModel();
        String identifier;
        for (int i = columnModel.getColumnCount() - 1; i >= 0; i--) {
            identifier = columnModel.getColumn(i).getIdentifier().toString();
            if (!IsColumnVisible(identifier)) {
                toggleColumnVisibility(identifier, true);
            }
        }

    }

    /**
     * Gets the width of the column
     * @param identifier the column name(Header Value)
     * @return the width of the column
     */
    public int getColumnWidth(String identifier) {
        TableColumnModel model = table.getColumnModel();
        return model.getColumn(model.getColumnIndex(identifier)).getWidth();
    }

    /**
     * Sets the preferred width of the column
     * @param identifier the column name(Header Value)
     * @param width the new width of the column
     */
    public void setColumnWidth(String identifier, Integer width) {
        TableColumnModel model = table.getColumnModel();
        System.out.println(identifier);
        model.getColumn(model.getColumnIndex(identifier)).setPreferredWidth(width);
    }


    /**
     * Sets the preferred width of the visible column specified by vColIndex. The column
     * will be just wide enough to show the column head and the widest cell in the column.
     *  margin pixels are added to the left and right.(resulting in an additional width of 2*margin pixels).
     * @see <a href="http://www.exampledepot.com/egs/javax.swing.table/PackCol.html">Packing a Column of a JTable Component - Example Depot</a>
     * @param vColIndex
     * @param margin
     */
    public void packColumn(int vColIndex, int margin) {
        DefaultTableColumnModel colModel = (DefaultTableColumnModel) table.getColumnModel();
        TableColumn col = colModel.getColumn(vColIndex);
        int width = 0;

        // Get width of column header
        TableCellRenderer renderer = col.getHeaderRenderer();
        if (renderer == null) {
            renderer = table.getTableHeader().getDefaultRenderer();
        }
        Component comp = renderer.getTableCellRendererComponent(
                table, col.getHeaderValue(), false, false, 0, 0);
        width = comp.getPreferredSize().width;

        // Get maximum width of column data
        for (int r = 0; r < table.getRowCount(); r++) {
            renderer = table.getCellRenderer(r, vColIndex);
            comp = renderer.getTableCellRendererComponent(
                    table, table.getValueAt(r, vColIndex), false, false, r, vColIndex);
            width = Math.max(width, comp.getPreferredSize().width);
        }

        // Add margin
        width += 2 * margin;

        // Set the width
        col.setPreferredWidth(width);
    }
}
