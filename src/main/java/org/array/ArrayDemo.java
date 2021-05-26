package org.array;

public class ArrayDemo {
    public static void main(String[] args)
    {
        int[][] arr={{2,3},{9,6,8},{99,77,6,77,6}};

        System.out.println(arr.length);

        for(int i = 0; i < arr.length ;i++)
        {
            for (int j =0;j < arr[i].length;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}
