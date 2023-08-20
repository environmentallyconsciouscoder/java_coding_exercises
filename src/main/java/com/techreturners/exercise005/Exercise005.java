package com.techreturners.exercise005;
import java.util.Map;
import java.util.HashMap;

public class Exercise005 {

    private final Map<Character, Boolean> alphabetMap = new HashMap<>();

    public boolean checkIfLettersArePresent() {
        for (boolean letterPresent : alphabetMap.values()) {
            if (!letterPresent) {
                return false;
            }
        }
        return true;
    }

    public boolean isPangram(String input) {
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetMap.put(c, false);
        }

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (alphabetMap.containsKey(c)) {
                    alphabetMap.put(c, true);
                }
            }
        }

        return checkIfLettersArePresent();
    }

}
