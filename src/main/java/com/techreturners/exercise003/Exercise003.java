
package com.techreturners.exercise003;

public class Exercise003 {

    // set up Array for icecream codes
    String[] icStore = {"Pistachio","Raspberry Ripple","Vanilla", "Mint Chocolate Chip","Chocolate","Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {
        for (int i=0; i < icStore.length; i++){
            if (icStore[i] == iceCreamFlavour )
                return i;
         }
        throw new UnsupportedOperationException("Your favour is not in store");
    }

    String[] iceCreamFlavours() {
        return icStore;
        //this method returns all flavour in the store and no need to throw error
        // throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

}
