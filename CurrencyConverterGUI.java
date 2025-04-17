
package ui;

import model.Currency;
import service.CurrencyConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CurrencyConverterGUI extends JFrame {
    private final CurrencyConverter converter = new CurrencyConverter();

    public CurrencyConverterGUI() {
        setTitle("Multi-Currency Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountField = new JTextField();

        JLabel fromLabel = new JLabel("From:");
        JComboBox<Currency> fromCurrency = new JComboBox<>(Currency.values());

        JLabel toLabel = new JLabel("To:");
        JComboBox<Currency> toCurrency = new JComboBox<>(Currency.values());

        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener((ActionEvent e) -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                Currency from = (Currency) fromCurrency.getSelectedItem();
                Currency to = (Currency) toCurrency.getSelectedItem();

                double result = converter.convert(amount, from, to);
                resultField.setText(String.format("%.2f %s", result, to));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input: " + ex.getMessage());
            }
        });

        add(amountLabel); add(amountField);
        add(fromLabel); add(fromCurrency);
        add(toLabel); add(toCurrency);
        add(new JLabel()); add(convertButton);
        add(resultLabel); add(resultField);
    }
}
