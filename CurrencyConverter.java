
package service;

import model.Currency;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    // Base currency: USD
    private final Map<Currency, Double> toUSD = new HashMap<>();

    public CurrencyConverter() {
        toUSD.put(Currency.USD, 1.0);
        toUSD.put(Currency.CNY, 0.14);
        toUSD.put(Currency.GBP, 1.25);
        toUSD.put(Currency.JPY, 0.0067);
        toUSD.put(Currency.KRW, 0.00075);
        toUSD.put(Currency.EUR, 1.08);
        toUSD.put(Currency.CHF, 1.10);
    }

    public double convert(double amount, Currency from, Currency to) {
        if (!toUSD.containsKey(from) || !toUSD.containsKey(to)) {
            throw new IllegalArgumentException("Unsupported currency.");
        }

        double inUSD = amount * toUSD.get(from);
        return inUSD / toUSD.get(to);
    }
}
