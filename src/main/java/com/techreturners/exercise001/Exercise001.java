package com.techreturners.exercise001;

import java.util.List;
import java.text.DecimalFormat;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = vatRate / 100;
        double total = vat * originalPrice + originalPrice;
        String resultString = Double.toString(total);
        if (resultString.endsWith(".0")) {
            resultString = resultString.substring(0, resultString.length() - 2);
            return Double.parseDouble(resultString);
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            String formattedResult = decimalFormat.format(total);
            return Double.parseDouble(formattedResult);
        }
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
