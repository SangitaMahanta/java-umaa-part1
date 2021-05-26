package org.assignment.activity13;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        int[][] two_d_array = {
                {2,5,9},
                {11,13,15},
                {21,23,25}
        };

        int i = 2;
        int j = 1;
        System.out.println(two_d_array[i][j]);
        int index = two_d_array[0].length * i + j;
        System.out.println(index);
        System.out.println(two_d_array[0]);

        int tempi = index / two_d_array[0].length;
        int tempj = index % two_d_array[1].length;

        System.out.println(tempi);
        System.out.println(tempj);

    }
}
