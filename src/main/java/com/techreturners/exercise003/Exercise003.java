package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        int iceCreamCode = 0;

        if (iceCreamFlavour == "Pistachio") {
            iceCreamCode = 0;
        } else if (iceCreamFlavour == "Raspberry Ripple") {
            iceCreamCode = 1;
        } else if (iceCreamFlavour == "Vanilla") {
            iceCreamCode = 2;
        } else if (iceCreamFlavour == "Mint Chocolate Chip") {
            iceCreamCode = 3;
        } else if (iceCreamFlavour == "Chocolate") {
            iceCreamCode = 4;
        } else {
            iceCreamCode = 5;
        }

        return iceCreamCode;
    }

    String[] iceCreamFlavours() {
        throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

}
