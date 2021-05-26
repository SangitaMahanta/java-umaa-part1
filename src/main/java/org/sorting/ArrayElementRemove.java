package org.sorting;

public class ArrayElementRemove {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        arr[5] = 16;
        int actualElementInArr = 6;
        int rmoveElement = 2;
        for (int i = rmoveElement; i < actualElementInArr-1; i++)
        {
            arr[i]=arr[i+1];// shifting the next element to targeted element position
            System.out.println(arr[i]);
        }
        arr[actualElementInArr-1]=0;
        actualElementInArr--;
    }
}
