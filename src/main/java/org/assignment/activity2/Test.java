package org.assignment.activity2;

public class Test {
    static {
        System.out.println("static m1() call inside static block.");
        m1();
    }
    static void m1(){
        System.out.println("statement within static method m1()..");
    }
    static void m2(){
        System.out.println("statement within static method m2()..");
        m1();
    }
    public static void main(String[] args) {
        System.out.println("Inside main method..");
        m1();
    }
}
