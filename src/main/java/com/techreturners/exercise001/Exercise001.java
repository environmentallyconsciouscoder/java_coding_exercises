package com.techreturners.exercise001;

import java.util.List;
import java.text.DecimalFormat;
import java.util.Objects;

import static java.lang.Character.toUpperCase;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return toUpperCase(firstName.charAt(0)) + "." + toUpperCase(lastName.charAt(0));
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
        StringBuilder reversedStringBuilder = new StringBuilder(sentence);
        reversedStringBuilder.reverse();
        return reversedStringBuilder.toString();
    }

    public int countLinuxUsers(List<User> users) {
        return (int) users.stream().filter(user -> Objects.equals(user.getType(), "Linux")).count();
    }
}
