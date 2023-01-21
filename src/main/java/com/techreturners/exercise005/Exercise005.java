package com.techreturners.exercise005;
import java.util.ArrayList;

public class Exercise005 {

    final static String alphabets = "abcdefghijklmnopqrstuvwxyz";

    public boolean isPangram(String input) {


        boolean charFound = false;

        if (input == null)
                return false;
        // setup alphaStream as list of each alphabet for matching use
        ArrayList<Character> alphaStream = new ArrayList<Character>();
        char[] alphaChar = alphabets.toCharArray();
        for (int i=0; i < alphaChar.length; i++){
            alphaStream.add(alphaChar[i]);
        }

        //start parsing the input each character; removed matched alphabet from alphaStream
        int scanIdx = 0;
        while ((alphaStream.size()>0) & (scanIdx < input.length())){
            charFound = false;
            int idx =0;
            do {
                if (Character.toLowerCase(input.charAt(scanIdx)) == alphaStream.get(idx))
                {
                    //System.out.println ("found"+ scanIdx);
                    alphaStream.remove(idx);
                    if (alphaStream.size() == 0)
                        return true;  // all alphabets are used, it is a pangram
                        //System.out.println("pangram");
                    charFound = true;
                } else
                    idx++;
            } while (!charFound & (idx < alphaStream.size()));
            scanIdx++;
        }
        //if (alphaStream.size() > 0)
        return false;    // not pangram

    }

}
