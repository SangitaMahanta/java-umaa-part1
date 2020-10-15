package org.assignment.activity3;

public class Test {
    void m1(){
        System.out.println("statement within non-static method m1()...");
    }
    void m2(){
        System.out.println("statement within non-static method m2()...");
        m1();
    }
    {
        System.out.println("inside non-static block call method m1()..");
        m1();
    }
    public static void main(String[] args) {
        System.out.println("statement inside main()...");
        Test var = new Test();
        var.m1();
    }
}
