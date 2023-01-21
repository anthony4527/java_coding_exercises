package com.techreturners.exercise005;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise005Test {

    private Exercise005 ex005;

    @BeforeEach
    public void setup() {
        ex005 = new Exercise005();
    }

    @Test
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkSentenceWithMissingLetterXIsNotAPangram() {
        assertFalse(ex005.isPangram("the quick brown fo jumps over the lazy dog"));
    }


    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkSentenceWithMissingLetterHIsNotAPangram() {
        assertFalse(ex005.isPangram("five boxing wizards jump quickly at it"));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }
// additional test cases added below
    @Test
    public void checkSentenceWithSpecialCharactersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 *quick brown fox* jumps over the lazy dogs"));
    }

    @Test
    public void checkSentenceWithLessThan26IsNotAPangram() {
        assertFalse(ex005.isPangram("the lazy dogs"));
    }

    @Test
    public void checkSentenceWithExtensiveLengthIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing  Five boXing wiZards wiZards wiZards wiZards wiZards something wrong Jump QuicklY  hhhhhh keyboardjumping"));
    }

    @Test
    public void checkSentenceFromPangramWebsiteIsAPangram() {
        assertTrue(ex005.isPangram("A quivering Texas zombie fought republic linked jewelry."));
    }

    @Test
    public void checkPerfectLowerCaseSentenceTypoIsNotAPangram() {
        assertFalse(ex005.isPangram("abcdefghijklmmopqrstuvwxyz"));
    }

    @Test
    public void checkSentenceIrregularSpaceIsAPangram() {
        assertTrue(ex005.isPangram("tuvwxyz abcd   efghi jklm         nopq         rs"));
    }
}

