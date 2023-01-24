
package com.techreturners.exercise003;

public class Exercise003 {

    String[] icStore = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {
        for (int i = 0; i < icStore.length; i++) {
            if (icStore[i].equalsIgnoreCase(iceCreamFlavour))
                return i;
        }
        return -1;
    }

    String[] iceCreamFlavours() {
        return icStore;
    }

}
