package edu.csc214.weighty;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests the {@link Converter} class.
 *
 * <p>This class verifies that ounce values are correctly converted into
 * decimal pounds and pounds with remaining ounces.</p>
 */
public class TestConverter {
    /**
     * Tests that zero ounces converts to zero decimal pounds.
     */
    @Test
    public void testZeroOuncesToPounds() {
        Converter converter = new Converter();

        assertEquals(0.0, converter.toPounds(0));
    }

    /**
     * Tests that sixteen ounces converts to one decimal pound.
     */
    @Test
    public void testSixteenOuncesToPounds() {
        Converter converter = new Converter();

        assertEquals(1.0, converter.toPounds(16));
    }

    /**
     * Tests that thirty-six ounces converts to decimal pounds.
     */
    @Test
    public void testThirtySixOuncesToPounds() {
        Converter converter = new Converter();

        assertEquals(2.25, converter.toPounds(36));
    }

    /**
     * Tests that eighteen ounces converts to one pound and two ounces.
     */
    @Test
    public void testEighteenOuncesToPoundsAndOunces() {
        Converter converter = new Converter();

        assertEquals("1 lb 2 oz", converter.toPoundsAndOunces(18));
    }

    /**
     * Tests that thirty-six ounces converts to two pounds and four ounces.
     */
    @Test
    public void testThirtySixOuncesToPoundsAndOunces() {
        Converter converter = new Converter();

        assertEquals("2 lbs 4 oz", converter.toPoundsAndOunces(36));
    }
}
