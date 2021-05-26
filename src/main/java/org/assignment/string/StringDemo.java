package org.assignment.string;


public class StringDemo {
    public static String previousString;
    public static String newString;

    public static String st = "013";


    public static int m;
    static boolean check(String str) {
        // Compute sum of digits
        int n = str.length();
        int digitSum = 0;
        for (int i = 0; i < n; i++)
            digitSum += (str.charAt(i) - '0');

        // Check if sum of digits is
        // divisible by 3.
        return (digitSum % 3 == 0);
    }

    public static int checkDigit(String st) {
        int n = Integer.parseInt(st);


        while ((n != 0) && (n != 1)) {
            n = n / 10;
        }
        if (n == 0) {
            n = n + 1;
        } else if (n != 0) {
            n = n + 1;
        }
        return n;

    }

    public static void m1() {
        switch (newString) {
            case "113":
                System.out.println("The replace newString is : " + newString);
                previousString = newString;
                check(previousString);
                break;

            case "213":
                System.out.println("The replace newString is : " + newString);
                previousString = newString;
                check(previousString);
                break;


            case "513":
                System.out.println("The replace newString is : " + newString);
                previousString = newString;
                check(previousString);
                break;


            case "813":
                System.out.println("The replace newString is : " + newString);
                previousString = newString;
                check(previousString);
                break;

        }
    }

    public static void main(String[] args) {

//        char[] a = st.toCharArray();
//        System.out.println(a);
        //for 100th position

//        for (int i = 0; i < 3; i++) {
//            if (check(previousString)) {
//                System.out.println("Yes");
//                newString ="213";
//                checkDigit(newString);
//            }
//            else{
//                System.out.println("No");
//
//            newString = "113";
//
//            System.out.println("The replace newString is : " + newString);
//            previousString = newString;
//        }
        previousString = st;

        for (int j = 0; j < 5; j++) {
            if (check(previousString)) {
                System.out.println("Yes");
                m = checkDigit(previousString);
                newString = m + "13";
                m1();

            } else {
                System.out.println("No");
                m = checkDigit(previousString);
                newString = m + "13";
              m1();
            }


        }

    }
}
