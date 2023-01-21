
package com.techreturners.exercise005;
import java.util.ArrayList;

public class Exercise005 {

    final static String APLHABETS = "abcdefghijklmnopqrstuvwxyz";
    final static Character SPACE =' ';

    public boolean isPangram(String input) {

        boolean charFound = false;

        if (input == null)
                return false;
        // setup alphaStream as list of each alphabet for matching use
        ArrayList<Character> alphaStream = new ArrayList<Character>();
        char[] alphaChar = APLHABETS.toCharArray();
        for (int i=0; i < alphaChar.length; i++){
            alphaStream.add(alphaChar[i]);
        }

        //start parsing the input each character; removed matched alphabet from alphaStream
        int scanIdx = 0;
        while ((alphaStream.size()>0) & (scanIdx < input.length())){
            charFound = false;
            int idx =0;
            // start check each character against stream of alphabet chars, skip if space
            if (input.charAt(scanIdx) != SPACE) {
                do {
                    if (Character.toLowerCase(input.charAt(scanIdx)) == alphaStream.get(idx)) {
                        alphaStream.remove(idx);
                        if (alphaStream.size() == 0)
                            return true;  // all alphabets are used, it is a pangram
                        //System.out.println("pangram");
                        charFound = true;
                    } else
                        idx++;
                } while (!charFound & (idx < alphaStream.size()));
            }
            scanIdx++;
        }

        return false;    // if method has not returned in above check, it is not a pangram

    }

}
