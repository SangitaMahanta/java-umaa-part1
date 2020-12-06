package org.assignment.activity8;


import static org.assignment.activity8.TestParent.m1;

public class InheritanceMain {
    public static void main(String[] args) {

        // parent reference variable of child object
        TestParent obj = new TestChild();
       m1(); // parent m1()
        obj.m2(); // child m2()


        TestChild obj1=new TestChild();
        obj1.m1();//child m1()
//        obj1.m2();// child m2()


    }
}



