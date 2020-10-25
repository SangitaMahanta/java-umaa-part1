package org.objects.inheritance.abstractconcept;

public class Test {
    public static void main(String[] args) {
//        Parent parent=new Parent();// abstract class have no object
        Parent p = new Child();
//        Child c=new Child();
//        c.m3();
//      m2(10); // this m2() direct invoke the parent class m2()
        p.m1();
    }


    // inner abstract class
    private abstract static class Parent extends GrandParent {
        // abstract class basically used in inheritance concept.
        // we can't create object of an abstract class.
        //Only we can define abstract() inside abstract class.
        // abstract class always define with abstract keyword.
        //abstract class can't be final.
        //we can't define body of an abstract() method.
        // abstract() method can be final but not private.
        // child class must implement body of abstract() method.
        // we can't define an abstract() as static also.

        public abstract void m1();

        public int m2(int x) {

            int y = x + 10;
            m1();
            return y;
        }
    }

    private static class Child extends Parent {
        @Override
        public void m1() {
            m3();
            System.out.println("in child class");
        }

        {
            // this non-static block execute during at the time of object creation
            int p = m2(10);
            System.out.println(p);
            System.out.println("--------------------------------------------------");
        }


    }
}

// outer class
class GrandParent {
    void m3() {
        System.out.println("In grandparent class");
    }
}
