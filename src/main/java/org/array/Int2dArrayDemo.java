package org.array;

import java.util.Arrays;

public class Int2dArrayDemo {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {9,8,5,4},
                {7,9,2,1},
                {5,8,7,10}
        };
        for (int i=0;i< arr.length;i++){
            int[] int1dArray=arr[i];
            for (int j:int1dArray
                 ) {
                System.out.println(j);
            }
            System.out.println("===============");
        }
    }

    // iterate with index
    public static void m4(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {9,8,5,4},
                {7,9,2,1},
                {5,8,7,10}
        };

//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));
//        System.out.println(Arrays.toString(arr[3]));

        for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));

        }


    }
    public static void m3(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {9,8,5,4},
                {7,9,2,1},
                {5,8,7,10}
        };
        for (int[] int1dArray:arr
             ) {
            for (int i:int1dArray
                 ) {
                System.out.println(i);
            }
            System.out.println("==================");
        }
    }

    public static void m2(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {9,8,5,4},
                {7,9,2,1},
                {5,8,7,10}
        };

        // for 2d array of index [0] i.e; similar to 1d array
        for (int i:arr[0]
             ) {
            // element of 0 index
            System.out.print(i);

        }
        System.out.println();

        for (int[] i:arr
             ) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void m1(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {9,8,5,4},
                {7,9,2,1},
                {5,8,7,10}
        };

        System.out.println(arr.getClass());

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[0].getClass());

        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));

    }
}
