package pl.touk.sputnik.TP1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CurrencyConverterTest {

    @Test
    public void testConvertValidAmountCADUSD() {

        CurrencyConverter converter = new CurrencyConverter();
        double convertedAmount = converter.convert(15, "CAD", "USD");
        double expected = 11.25;

        assertEquals(expected, convertedAmount, "The conversion is correct.");
    }

    @Test
    public void testConvertValidAmountUSDCAD() {

        CurrencyConverter converter = new CurrencyConverter();
        double convertedAmount = converter.convert(15, "USD", "CAD");
        double expected = 20.1;

        assertEquals(expected, convertedAmount, "The conversion is correct.");
    }

    @Test
    public void testConvertValidAmountCADEUR() {

        CurrencyConverter converter = new CurrencyConverter();
        double convertedAmount = converter.convert(10, "CAD", "EUR");
        double expected = 6.8999999999999995;

        assertEquals(expected, convertedAmount, "The conversion is correct.");
    }

    @Test
    public void testConvertValidAmountEURCAD() {

        CurrencyConverter converter = new CurrencyConverter();
        double convertedAmount = converter.convert(10, "EUR", "CAD");
        double expected = 14.5;

        assertEquals(expected, convertedAmount, "The conversion is correct.");
    }


    @Test
    public void testConversionInvalidCurrency() {

        CurrencyConverter converter = new CurrencyConverter();
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(15, "MAD", "CAD");
        }, "An IllegalArgumentException should be thrown for an unknown currency.");
    }
}
