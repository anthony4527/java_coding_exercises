package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercise004 {

    LocalDateTime moment;

    public Exercise004(LocalDate date) {
        //set moment being start time of the date parameter
        moment = date.atStartOfDay();
        //throw new UnsupportedOperationException("You can delete this statement and add your code here.");
    }

    public Exercise004(LocalDateTime dateTime) {
        //set moment as date time parameter
        moment = dateTime;
        //throw new UnsupportedOperationException("You can delete this statement and add your code here.");
    }

    public LocalDateTime getDateTime() throws UnsupportedOperationException {
        if (moment == null){
            throw new UnsupportedOperationException("Start moment has not been defined");
        }
        //add 1 giga seconds being 10 power 9 to the moment time for this object
        long gSec = (long) Math.pow(10, 9);
        //System.out.println("added "+ moment.plusSeconds(gSec));
        return moment.plusSeconds(gSec);

    }
}
