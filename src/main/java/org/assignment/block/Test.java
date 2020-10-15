package org.assignment.block;

public class Test {
    static {
        System.out.println("Inside first static block.");
    }
    static {
        System.out.println("Inside second static block.");
    }
    {
        System.out.println("Inside first non-static block.");
    }
    {
        System.out.println("Inside second non-static block.");
    }
    public static void main(String[] args)
    {
        System.out.println("Inside main method");
        new Test();
    }
}
