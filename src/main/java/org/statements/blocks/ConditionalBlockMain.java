package org.statements.blocks;

import java.util.Scanner;

public class ConditionalBlockMain {
    public static int firstNum;
    public static int secondNum;
    public static int thirdNum;
    int greaterNum=0;

    public static void main(String[] args) {
        System.out.println("++++++Take input three Number++++++");
        Scanner sc = new Scanner(System.in);
        ConditionalBlockMain block = new ConditionalBlockMain();
        System.out.println("Enter first Number : ");
        firstNum = sc.nextInt();
        System.out.println("Enter second Number : ");
        secondNum = sc.nextInt();
        System.out.println("Enter third Number : ");
        thirdNum = sc.nextInt();

        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("\nEntered Number are Equal ");
        } else if (firstNum > secondNum && firstNum > thirdNum)
            block.greaterNum = firstNum;
        else if (secondNum > thirdNum && thirdNum > firstNum)
            block.greaterNum = secondNum;
        else if (thirdNum > firstNum)
            block.greaterNum = thirdNum;
        else
            System.out.println();
        System.out.println("The greatest number is " + block.greaterNum + "\n");




            if ((firstNum >= 0) && (secondNum >= 0) && (thirdNum >= 0)) {
                System.out.println("Entered numbers are all positive numbers.");
            } else if ((firstNum < 0) && (secondNum < 0) && (thirdNum < 0)) {
                System.out.println("Entered numbers are all negative numbers.");
            } else {
                System.out.println("Entered numbers are mixed numbers.");
            }
        }

}