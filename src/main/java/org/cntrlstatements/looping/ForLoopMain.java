package org.cntrlstatements.looping;

public class ForLoopMain {
    public static void main(String[] args) {
       display();
        System.out.println("--------------------------------");
       display1();
    }

    private static void display(){
//        int i = 1;
     for (int i=1;i<=10;i++)//for (; i<=10 ;)
     {
            System.out.println(i);
//            i++;
        }
        System.out.println("Done..!");
    }


    private static void display1(){
//      i : 1 to 10
//      j : 1 to 10


        for (int i=1,j=1;i<=10 || j<=10; i++,j++)
        {
            System.out.println("i = "+i+" & j = "+j);
            System.out.println("Both sum is = "+(i+j));
        }
    }
}
