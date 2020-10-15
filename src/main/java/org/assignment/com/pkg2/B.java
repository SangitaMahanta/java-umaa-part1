package org.assignment.com.pkg2;

import org.assignment.com.pkg1.A;

public class B {
    public static void main(String[] args)
    {
        A a = new A();
        System.out.println(a.getI());
        System.out.println(a.j);
        System.out.println(a.getK()); // why this is not accessible?
    }
}
