package org.methods.statics;

import java.util.Scanner;

public class StaticMethodMain {
    static int num;
    static int cubeSum = 0;
    static int factorial=1;


    public int armstrong(int n) {

        while (num > 0) {
            int digit = num % 10;
            cubeSum = cubeSum + (digit * digit * digit);
            num /= 10;
        }

        if (cubeSum == n)
            return 1;
        else
            return 0;
    }


     static int factorCalculator(int n) {
        for (int i = 1; i <= n; i++) {
            factorial = factorial *i;
        }
        return factorial;
    }

    public static void main(String args[]) {


        StaticMethodMain obj = new StaticMethodMain();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();

        System.out.println("Press  1.To Calculate Armstrong Number :\n \t\t2.To Calculate Factorial : ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                int res = obj.armstrong(num);
                if (res == 1)
                    System.out.println(num + " is an Armstrong number");
                else
                    System.out.println(num + " is not an Armstrong number");
                break;
            case 2:
                int result= factorCalculator(num);
                System.out.println(" The Factorial of Number " + num + " is :" + result);
                break;
            default:
                System.out.println(" Wrong choice ! Please Enter Again...");
        }

    }
}





