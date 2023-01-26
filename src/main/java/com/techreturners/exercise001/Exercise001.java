
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
        StringBuilder stringBuild = new StringBuilder(sentence);
        return stringBuild.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        return (int)users.stream().filter(usr -> usr.getType().equalsIgnoreCase("Linux")).count();
    }
}
