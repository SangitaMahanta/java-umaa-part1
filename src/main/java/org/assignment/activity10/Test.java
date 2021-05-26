package org.assignment.activity10;

class X {
    X() // parent class constructor
    {
        System.out.println("X() : parent class ");
    }
}

class Y extends X {
    Y() {
        super(); // super() constructor
        System.out.println("Y() : child class ");
    }

    X fun() {
        X obj1 = new X();
        return obj1;
    }
}

public class Test {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.fun();
    }
}

