package org.objects.inheritance.senario.overloadingandoverriding;

// overloading : it possible between two classes (inheritance ) or in the same class.
//             - method name must be same.but differ in parameter
//             - its compile time polymorphism
//
// overriding : only possible in  "non-static()".
//            - its run time polymorphism.

public class Test19 {
    public static void main(String[] args) {
        A a = new B();
        a.m1(10);
        a.m1();

        B b = new B();
        b.m1(10, 20);
        b.m1();
        b.m1(40);
    }

    private static class A {
        // method overload
        public void m1(int i) {
            System.out.println("i = " + i);
        }

        public static void m1() {
            System.out.println("m1()");
        }
    }

    private static class B extends A {
        public void m1(int x, int y) {
            x = x + y;
            System.out.println("x = " + x);
        }


    }
}


