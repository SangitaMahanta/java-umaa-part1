package org.example;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        //cal = null; // NullPointerException
        int sumResult = cal.sum(10, 20); // non-static resource
        System.out.println("The Summation result is: "+sumResult);

        int subResult = cal.sub(30, 10); // non-static resource
        System.out.println("The Subtraction result is: "+subResult);

        int mulResult = Calculator.mul(20, 2);
        System.out.println("The Multiplication result is: "+mulResult);

        int divResult = Calculator.div(20, 2);
        System.out.println("The Division result is: "+divResult);

        cal = null;
        mulResult = cal.mul(10, 6);
        System.out.println(mulResult);

        //Collections.binarySearch(null, null);
    }
}
