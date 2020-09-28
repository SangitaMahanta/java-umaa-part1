package org.numberSystem;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        int a = 1400764;
        NumberSystem nm = new NumberSystem();
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);//For user input
        int b = sc.nextInt();
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toHexString(b));
        System.out.println(Integer.toOctalString(b));
    }
}