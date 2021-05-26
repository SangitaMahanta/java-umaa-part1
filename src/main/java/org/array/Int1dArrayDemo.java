package org.array;


public class Int1dArrayDemo {
    public static void main(String[] args) {
       //1d array declaration
        int[] arr = {1,4,5,6};

        for (int i:arr
             ) {
            System.out.println(i);
        }
        System.out.println(arr.getClass());
    }
}
