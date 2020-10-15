package org.objects.inheritance.basicInheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m4();

        m1();
        m2();
        m3();


    }

    private static void m3() {
        Parent c1 = new Child();
        Child c2 = new Child();

        System.out.println(c1.getClass());
        System.out.println(c2.getClass());

        System.out.println(c1 instanceof Child);
        System.out.println(c1 instanceof Parent);
        System.out.println(c2 instanceof Child);
        System.out.println(c2 instanceof Parent);

        Parent p1 = new Parent();
        System.out.println(p1 instanceof Child);

        Child c12 = (Child) c1;
        System.out.println(c12.getClass());

        p1 = new Child();
        Child c11 = (Child) p1;
        System.out.println(c11.getClass());
    }

    private static void m1() {
        Child c1 = new Child();
        System.out.println(c1.getClass());

        System.out.println("value of i : " + c1.i);
        System.out.println("value of y : " + c1.y);

        c1.m4();
        c1.m2();
        c1.m3();
    }

    private static void m2() {
        Parent c1 = new Child();
        System.out.println(c1.getClass());


        System.out.println("value of x : " + c1.x);
        System.out.println("value of x : " + c1.y);

        c1.m4(); // parent class non-static method
        c1.m2();

        c1.m1();//parent class static method

    }


}
