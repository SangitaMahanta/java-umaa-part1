package org.objects.inheritance.basicInheritance;

public class Child extends Parent {
    public static int x = 40;
    public int i = 100;

    public void m3() {
        System.out.println("child : m3()");
        x = 50;
        m4();
    }

    public void m2() // override method
    {
        System.out.println("child : m2()");
        m1();
    }

    public static void m1() {
        System.out.println("child : m1() static");
    }
}
