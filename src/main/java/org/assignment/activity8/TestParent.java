package org.assignment.activity8;

public class TestParent {
    public static int x =12; // static variable
    public int y;// non-static variable


    public void m2(){
        y=10;
        System.out.println("parent class non-static m2()");
        System.out.println("parent non-static variable y =  "+y);
    }
    public static void m1(){
        System.out.println("parent class static m1()");
        System.out.println("parent static variable x = "+x);

    }
}
 class TestChild extends TestParent{
    public void m2(){
        y=100;
        System.out.println("child class non-static m2() ");
        System.out.println("child   y = "+y);
    }
public static void m1(){
        x=90;
    System.out.println("child class static m1() ");
    System.out.println("child x =  "+x);
}
}
