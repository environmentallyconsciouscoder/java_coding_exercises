package com.techreturners.exercise003;

public class Exercise003 {

    private String pistachio = "Pistachio";
    private String raspberryRipple = "Raspberry Ripple";
    private String vanilla = "Vanilla";
    private String mintChocolateChip = "Mint Chocolate Chip";
    private String chocolate = "Chocolate";
    private String mangoSorbet = "Mango Sorbet";

    int getIceCreamCode(String iceCreamFlavour) {
        int iceCreamCode = 0;

        if (iceCreamFlavour == pistachio) {
            iceCreamCode = 0;
        } else if (iceCreamFlavour == raspberryRipple) {
            iceCreamCode = 1;
        } else if (iceCreamFlavour == vanilla) {
            iceCreamCode = 2;
        } else if (iceCreamFlavour == mintChocolateChip) {
            iceCreamCode = 3;
        } else if (iceCreamFlavour == chocolate) {
            iceCreamCode = 4;
        } else if (iceCreamFlavour == mangoSorbet) {
            iceCreamCode = 5;
        }

        return iceCreamCode;
    }

    String[] iceCreamFlavours() {
        String[] currentFlavours = { pistachio, raspberryRipple, vanilla, mintChocolateChip, chocolate, mangoSorbet };
        return currentFlavours;
    }

}
