package org.assignment.string;

import java.util.Arrays;
import java.util.Scanner;

class StringPalindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch= str.toCharArray();

        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
           if( ch[i] != ch[j])
           {
               break;
           }

               System.out.println();
//            ch[j] = temp;
            i = i + 1;
            j = j - 1;

        }
        
String s = Arrays.toString(ch);
        if ((str)==(s)){
            System.out.println("The input string "+str+" is a palindrome ");}
        else{
            System.out.println("The input string "+str+" is not a palindrome ");
    }}
}

