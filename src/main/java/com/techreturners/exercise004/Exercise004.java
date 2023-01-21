package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercise004 {

    LocalDateTime moment;
    static final long GIGASECOND = (long) Math.pow(10, 9); //Giga seconds of time

    public Exercise004(LocalDate date) {
        //set moment being start time of the date parameter
        moment = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        //set moment as date time parameter
        moment = dateTime;
    }

    public LocalDateTime getDateTime() throws UnsupportedOperationException {
        if (moment == null) {
            throw new UnsupportedOperationException("Start moment has not been defined");
        }
        //add 1 giga seconds being 10 power 9 to the moment time for this object
        return moment.plusSeconds(GIGASECOND);

    }
}
