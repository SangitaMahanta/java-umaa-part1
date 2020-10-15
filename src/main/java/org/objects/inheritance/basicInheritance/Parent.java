package org.objects.inheritance.basicInheritance;

public class Parent {
    public static int x;
    public int y = 10;

    public Parent() {
        x = 30;
        y = 20;
        System.out.println("parent class no argument constructor");
    }

    public static void m1() {
        System.out.println("static m1() inside parent");
        System.out.println(x);
    }

    public void m2() {
        System.out.println("parent m2()");
        System.out.println(y);
    }

    void m4() {
        System.out.println("parent : m4()");
    }
}
