package pl.touk.sputnik.TP1;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {

    public static final Map<String, Double>  conversionRate = new HashMap<>();

    static {
        conversionRate.put("USDCAD", 1.34);
        conversionRate.put("CADUSD", 0.75);
        conversionRate.put("EURCAD", 1.45);
        conversionRate.put("CADEUR", 0.69); //Nice.
    }

    public double convert(double amount, String sourceCurrency, String targetCurrency) throws IllegalArgumentException {
        String conversionKey = sourceCurrency + targetCurrency;
        Double rate = conversionRate.get(conversionKey);

        if (rate == null) {
            throw new IllegalArgumentException("Conversion rate unavailable for the " + conversionKey + "pair");
        }

        return amount*rate;
    }

}
