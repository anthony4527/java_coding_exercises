package com.techreturners.exercise002;

public class Exercise002 {

    //static final Int adultAge = 18;
    public boolean isFromManchester(Person person) {
        // Add your code here
        if (person.getCity() == "Manchester"){
            return true;
        }else return false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        // Add your code here
        if (person.getAge() >= ageLimit){
            return true;
        }
        return false;
    }
    
}
