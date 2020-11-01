package org.cntrlstatements.looping;

public class DoWhileMain {
    public static void main(String[] args) {
        display();
    }

    private static void display(){
        int i = 1;
        do {

            System.out.println(i);
            i++;
        }while (i<=10);
        System.out.println("Done..");
    }
}
