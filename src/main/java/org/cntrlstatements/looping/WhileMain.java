package org.cntrlstatements.looping;

public class WhileMain {
//    display number from 1-10 using while

    public static void main(String[] args) {
        display();
    }

    private static void display(){
        int i = 1;
        while (i<= 10){
            System.out.println(i);
            i++;
        }
    }
}
