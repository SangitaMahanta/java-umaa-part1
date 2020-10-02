package org.objects.constructor;

import java.util.Scanner;

public class LaptopDiscountMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LaptopDiscount laptopDiscount=new LaptopDiscount();//Default constructor

        System.out.println("Enter Customer name : ");
        laptopDiscount.name=sc.nextLine();

        System.out.println("Enter Price : ");
        laptopDiscount.price=sc.nextInt();

      LaptopDiscount laptopDiscount1=new LaptopDiscount(laptopDiscount.name,laptopDiscount.price);//parameterize constructor
        System.out.println();
       laptopDiscount1.compute();
       laptopDiscount1.display();
        System.out.println();


        laptopDiscount.compute(laptopDiscount1);
        System.out.println("Customer name : "+laptopDiscount.getName());
        System.out.println("Price is : "+laptopDiscount.getPrice());
        System.out.println("Discount is : "+laptopDiscount.getDiscount());
        System.out.println("After discount total amount is : "+laptopDiscount.getAmount());
    }
}
