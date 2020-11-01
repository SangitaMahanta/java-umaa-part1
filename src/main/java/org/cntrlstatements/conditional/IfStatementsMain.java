package org.cntrlstatements.conditional;

public class IfStatementsMain {
    public static void main(String[] args) {
        evaluatedDecission();
        displayResults();

    }

    //if statement block
    private static void evaluatedDecission() {
        int x = 10;
        if (x % 2 == 0) {
            System.out.println("even");
        }
        System.out.println("odd");
        System.out.println("Done..!");
    }

    private static boolean checkEvenOdd(int x) {
        return x % 2 == 0;
    }

    //if-else statements block
    private static void displayResults() {
        int x = 99;
        if (checkEvenOdd(x)) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        System.out.println("Remaining statements..!");
    }
}

