package edu.csc214.weighty;

import java.util.Locale;

/**
 * Converts ounce values into pound-based representations.
 *
 * <p>This class owns the conversion logic for the Terribly Weighty Subject
 * application. It converts whole-number ounces into decimal pounds and/or into
 * pounds with remaining ounces.</p>
 */
public class Converter {
    /**
     * The number of ounces in one pound.
     */

    // Declaring this as final since it really shouldn't change.
    // Also, since it is a constant, static makes sense since it will remain the same across all instances of Converter.
    private static final int OUNCES_PER_POUND = 16;

   public String toPounds(int ounces) { 
    double pounds = ounces / (double) OUNCES_PER_POUND; 
    String poundUnit = pounds == 1.0 ? "lb" : "lbs";
    return String.format(Locale.US, "%.4f %s", pounds, poundUnit); 
   }


    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / OUNCES_PER_POUND;
        int remainingOunces = ounces % OUNCES_PER_POUND;

        String poundUnit = (pounds == 1) ? "lb" : "lbs";
        String ounceUnit = "oz"; 
        return pounds + " " + poundUnit + " " + remainingOunces + " " + ounceUnit;

    }
}
