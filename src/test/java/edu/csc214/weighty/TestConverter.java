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
    @Test
    public void zeroOuncesToPounds() {
        Converter converter = new Converter();

        assertEquals("0.0000 lbs", converter.toPounds(0));
    }

    @Test
    public void oneOunceToPounds() {
        Converter converter = new Converter();

        assertEquals("0.0625 lbs", converter.toPounds(1));
    }

    @Test
    public void twoOuncesToPounds() {
        Converter converter = new Converter();

        assertEquals("0.1250 lbs", converter.toPounds(2));
    }

    @Test
    public void sixteenOuncesToPounds() {
        Converter converter = new Converter();

        assertEquals("1.0000 lb", converter.toPounds(16));
    }

    @Test
    public void twentyFourOuncesToPounds() {
        Converter converter = new Converter();

        assertEquals("1.5000 lbs", converter.toPounds(24));
    }

    @Test
    public void thirtyTwoOuncesToPounds() {
        Converter converter = new Converter();

        assertEquals("2.0000 lbs", converter.toPounds(32));
    }

    @Test
    public void zeroOuncesToPoundsAndOunces() {
        Converter converter = new Converter();

        assertEquals("0 lbs 0 oz", converter.toPoundsAndOunces(0));
    }

    @Test
    public void oneOunceToPoundsAndOunces() {
        Converter converter = new Converter();

        assertEquals("0 lbs 1 oz", converter.toPoundsAndOunces(1));
    }

    @Test
    public void twoOuncesToPoundsAndOunces() {
        Converter converter = new Converter();

        assertEquals("0 lbs 2 oz", converter.toPoundsAndOunces(2));
    }

    @Test
    public void sixteenOuncesToPoundsAndOunces() {
        Converter converter = new Converter();

        assertEquals("1 lb 0 oz", converter.toPoundsAndOunces(16));
    }

    @Test
    public void twentyFourOuncesToPoundsAndOunces() {
        Converter converter = new Converter();

        assertEquals("1 lb 8 oz", converter.toPoundsAndOunces(24));
    }

    @Test
    public void thirtyTwoOuncesToPoundsAndOunces() {
        Converter converter = new Converter();

        assertEquals("2 lbs 0 oz", converter.toPoundsAndOunces(32));
    }
}
