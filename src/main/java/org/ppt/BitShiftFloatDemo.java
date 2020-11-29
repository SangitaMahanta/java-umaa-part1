package org.ppt;

public class BitShiftFloatDemo {
    public static void main(String[] args) {

        float x = 5.6f;
        System.out.println(x);
        System.out.println((Float.floatToIntBits(x)));
        // 5 + 0.6 101+0.1 = 2^2 * 2 0
    }
}
