package org.ppt;

public class BitShiftDemo {

    public static void main(String args[]) {

        // left shift operation(<<)
        System.out.println("Left shift operation");
        int x = 4;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));


        x = x << 2; // x * 2^2
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        int y = -4;
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));

        // 11111111  11111111  11111111  11110000
        // 10000000  00000000  00000000  00001111
        // 00000000  00000000  00000000  00000001
        // 10000000  00000000  00000000  00010000

        y = y << 2;
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));
        System.out.println("---------------------------------------");


        // right shift operation(>>)
        System.out.println("\nRight shift operation");

        x = 4;
        System.out.println(x); //4
        System.out.println(Integer.toBinaryString(x)); // 0100


        x = x >> 2;
        System.out.println(x); // 1
        System.out.println(Integer.toBinaryString(x));

        y = -4;
        System.out.println(y); // -4
        System.out.println(Integer.toBinaryString(y));

        y = y >> 2;
        System.out.println(y); // -1
        System.out.println(Integer.toBinaryString(y));
        System.out.println("---------------------------------------");

        // Unsigned right shift operation(>>>)
        System.out.println("\nUnsigned Right shift operation");

        x = 4;
        System.out.println(x); //4
        System.out.println(Integer.toBinaryString(x)); // 0100


        x = x >>> 2;
        System.out.println(x); // 1
        System.out.println(Integer.toBinaryString(x));

        y = -4;
        System.out.println(y); // -4
        System.out.println(Integer.toBinaryString(y));

        y = y >>> 2;
        System.out.println(y); //
        System.out.println(Integer.toBinaryString(y));

    }
}
