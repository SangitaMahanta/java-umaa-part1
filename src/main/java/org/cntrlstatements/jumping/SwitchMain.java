package org.cntrlstatements.jumping;

public class SwitchMain {

    public static void main(String[] args) {
        displaySwitch();
    }

    private static void displaySwitch() {
        String day = "SAT";

        switch (day) {
            case "MON":
                System.out.println(" It is a Monday");
                break;
            case "TUES":
                System.out.println(" It is a Tuesday");
                break;

            case "WED":
                System.out.println(" It is a Wednesday");
                break;

            case "THUR":
                System.out.println(" It is a Thursday");
                break;

            case "FRI":
                System.out.println(" It is a Friday");
                break;

            case "SAT":
                System.out.println(" It is a Weekend-1");

            case "SUN":
                System.out.println(" It is a Weekend-2");

                break;
            default:
                System.out.println(" Invalid day...");
        }
    }
}


