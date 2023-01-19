package com.techreturners.exercise004;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    // additional test case - add time to a Leap Year Feb 29 date
    @Test
    public void checkGetDateTimefromLeapYearDate() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2024, Month.FEBRUARY, 29));
        LocalDateTime expected = LocalDateTime.of(2055, Month.NOVEMBER, 07, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    // additional test case - add time to a past date before Y2K - date of birth
    @Test
    public void checkGetDateTimefromPastDate() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(1963, Month.DECEMBER, 24, 23, 22, 0, 0 ));
        LocalDateTime expected = LocalDateTime.of(1995, Month.SEPTEMBER, 02, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }
}
