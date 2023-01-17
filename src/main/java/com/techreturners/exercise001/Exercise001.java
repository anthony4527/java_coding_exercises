
package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return (Character.toUpperCase(word.charAt(0)) + word.substring(1));
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return Character.toUpperCase(firstName.charAt(0)) + "."+ Character.toUpperCase(lastName.charAt(0)) ;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return Math.round( (originalPrice + originalPrice * vatRate/100 )* 100.0) / 100.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        String revStn = "";
        char[] chars = sentence.toCharArray();
        int lastIdx = chars.length -1 ;
        for (int i=0; i< chars.length; i++)
        {
            revStn = revStn + chars[lastIdx -i];
        }
        return revStn;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int count = 0;
        for (int i=0; i<users.size(); i++)
        {
            //System.out.println(users.get(i).getType());
            if (users.get(i).getType() == "Linux") {
                count++;
            }
        }
        return count;
    }
}
