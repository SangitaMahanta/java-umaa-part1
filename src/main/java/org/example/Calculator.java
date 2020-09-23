package org.example;

public class Calculator {
    public int sum(int x, int y) // non-static methode
    {
        int result = x + y;
        return result;
    }
    public int sub(int x, int y) // non-static methode
    {
        int result = x - y;
        return result;
    }

    public static int mul(int x, int y) // static methode
    {
        int result = x * y;
        return result;
    }

    public static int div(int x, int y) // static methode
    {
        int result = x / y;
        return result;
    }
}
