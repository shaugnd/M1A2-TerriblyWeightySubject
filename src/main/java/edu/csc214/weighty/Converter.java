package edu.csc214.weighty;

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

    /**
     * Converts ounces into decimal pounds.
     *
     * @param ounces the whole-number ounce value to convert
     * @return the equivalent value in decimal pounds
     */
    public double toPounds(int ounces) {
        return ounces / (double) OUNCES_PER_POUND;
    }

    /**
     * Converts ounces into a formatted pounds-and-ounces string.
     *
     * @param ounces the whole-number ounce value to convert
     * @return the value formatted as pounds and remaining ounces
     */
    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / OUNCES_PER_POUND;
        int remainingOunces = ounces % OUNCES_PER_POUND;

        // return pounds + " lb " + remainingOunces + " oz";

        // updated to handle lb vs lbs and oz 
        String poundUnit = (pounds == 1) ? "lb" : "lbs";
        String ounceUnit = "oz"; // "oz" is the same for singular and plural, so we can just use "oz"
        return pounds + " " + poundUnit + " " + remainingOunces + " " + ounceUnit;

    }
}
