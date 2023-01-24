
package com.techreturners.exercise005;
import java.util.ArrayList;

public class Exercise005 {

    final static String APLHABETS = "abcdefghijklmnopqrstuvwxyz";
    final static Character SPACE =' ';

    public boolean isPangram(String input) {

        boolean charFound = false;

        if (input == null)
                return false;

        ArrayList<Character> alphaStream = new ArrayList<Character>();
        char[] alphaChar = APLHABETS.toCharArray();
        for (int i=0; i < alphaChar.length; i++){
            alphaStream.add(alphaChar[i]);
        }

        int scanIdx = 0;
        while ((alphaStream.size()>0) & (scanIdx < input.length())){
            charFound = false;
            int idx =0;

            if (input.charAt(scanIdx) != SPACE) {
                do {
                    if (Character.toLowerCase(input.charAt(scanIdx)) == alphaStream.get(idx)) {
                        alphaStream.remove(idx);
                        if (alphaStream.size() == 0)
                            return true;
                        charFound = true;
                    } else
                        idx++;
                } while (!charFound & (idx < alphaStream.size()));
            }
            scanIdx++;
        }

        return false;

    }

}
