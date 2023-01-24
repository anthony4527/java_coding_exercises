package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercise004 {

    LocalDateTime moment;
    static final long GIGASECOND = (long) Math.pow(10, 9); //Giga seconds of time

    public Exercise004(LocalDate date) {
        moment = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        moment = dateTime;
    }

    public LocalDateTime getDateTime() throws UnsupportedOperationException {
        if (moment == null) {
            throw new UnsupportedOperationException("Start moment has not been defined");
        }
        return moment.plusSeconds(GIGASECOND);
    }
}
