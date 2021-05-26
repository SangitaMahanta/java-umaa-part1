package org.cntrlstatements.jumping;

public class AssignmentIfElseIf {
    public static void main(String[] args) {
        displaySwitch();
    }

    private static void displaySwitch() {
       String day="SUN";

       if(day.equals("MON")) {
           System.out.println("It is a Monday");
       }
       else if (day .equals("TUS")){
           System.out.println(" It is a Tuesday");
       }
       else if (day.equals("WED")) {
           System.out.println(" It is a Wednesday");
       }
       else if (day.equals("THUR")) {
           System.out.println(" It is a Thursday");
       }
       else if (day.equals("FRI")) {
           System.out.println(" It is a Friday");
       }
       else if (day.equals("SAT")||day.equals("SUN"))
       {
           System.out.println(" It is a Weekend-1");
           System.out.println(" It is a Weekend-2");
       }
       else
        System.out.println(" Invalid Day..");
    }
}
