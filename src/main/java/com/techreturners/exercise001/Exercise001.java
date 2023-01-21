
package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {

    static final int BASE = 100;

    public String capitalizeWord(String word) {
        return (Character.toUpperCase(word.charAt(0)) + word.substring(1));
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        return Math.round((originalPrice + originalPrice * vatRate / BASE ) * 100.0) / 100.0;
    }

    public String reverse(String sentence) {
        String revSentence = "";
        char[] chars = sentence.toCharArray();
        int lastIdx = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            revSentence = revSentence + chars[lastIdx - i];
        }
        return revSentence;
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getType().equalsIgnoreCase("Linux")) {
                count++;
            }
        }
        return count;
    }
}
