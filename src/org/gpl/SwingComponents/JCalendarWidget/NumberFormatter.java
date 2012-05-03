

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

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is a Singleton class required for localizing the numbers used
 * in this widget. Just set the character used for zero.
 * Heres the link for <a href="http://unicode.org/charts/">Unicode 6.0 Character Code Charts</a>
 * for usage help look at the main method.
 * @author Naveed Quadri
 * @version 1.0
 */
public class NumberFormatter {

    private char zeroDigit;
    private final NumberFormat nf;
    private final DecimalFormat df;
    private final DecimalFormatSymbols dfs;

    private NumberFormatter() {
        nf = NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        df = (DecimalFormat) nf;
        dfs = df.getDecimalFormatSymbols();
    }

    /**
     * Gets the char used for zero. In Devangiri(Hindi) script its '/u966'
     * @return the char used for zero
     */
    public char getZeroDigit() {
        return zeroDigit;
    }

    /**
     * Sets the char used for zero. For Devangiri(Hindi) script its '/u966'
     * @param zeroDigit the char used for zero
     */
    public void setZeroDigit(char zeroDigit) {
        this.zeroDigit = zeroDigit;
        dfs.setZeroDigit(zeroDigit);
        df.setDecimalFormatSymbols(dfs);
    }

    /**
     * Formats the given number to a localized number string depending on <code>setZeroDigit</code>
     * @param number the number to be localized
     * @return the localized number string
     */
    public String format(int number) {
        return nf.format(number);
    }

    /**
     * Converts a localized number string to its decimal representation
     * @param s localized number string
     * @return equivalent decimal value
     */
    public int decimalValue(String s) {
        int i = 0;
        try {
            i = nf.parse(s).intValue();
        } catch (ParseException ex) {
            Logger.getLogger(NumberFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return i;
    }

    /**
     * 
     * @return the instance for this class
     */
    public static NumberFormatter getInstance() {
        return NumberFormatterHolder.INSTANCE;
    }

    private static class NumberFormatterHolder {
        private static final NumberFormatter INSTANCE = new NumberFormatter();
    }

    public static void main(String[] args) {
        NumberFormatter nf = NumberFormatter.getInstance();
        nf.setZeroDigit('\u0966');
        String s = nf.format(1234567890);
        System.out.println(s);
        System.out.println(nf.decimalValue(s));
    }
}
