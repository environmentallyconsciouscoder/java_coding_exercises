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
        switch (iceCreamFlavour) {
            case "Pistachio":
                iceCreamCode = 0;
                break;
            case "Raspberry Ripple":
                iceCreamCode = 1;
                break;
            case "Mint Chocolate Chip":
                iceCreamCode = 3;
                break;
            case "Chocolate":
                iceCreamCode = 4;
                break;
            case "Mango Sorbet":
                iceCreamCode = 5;
                break;
            default:
                System.out.println("Invalid ice cream flavor");
        }

        return iceCreamCode;
    }


    String[] iceCreamFlavours() {
        return new String[] { pistachio, raspberryRipple, vanilla, mintChocolateChip, chocolate, mangoSorbet };
    }

}
