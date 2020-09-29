package org.objects.bankingInformation;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {

        System.out.println("..................Welcome to our BankingApplication System..............\n");


        System.out.println(" Enter your Credential Information \n");

        Scanner sc=new Scanner(System.in);
        System.out.println(" Please Enter your Name : ");
        String name=sc.nextLine();

        System.out.println("\n Please Enter your Acc_No : ");
        String accNo=sc.nextLine();

        System.out.println(" \nPlease Enter your Email : ");
        String emailId=sc.nextLine();

        System.out.println(" \nPlease Enter your PhoneNo : ");
        String phoneNo=sc.nextLine();

        System.out.println(" \nPlease Enter your CustomerId : ");
        String customerId=sc.nextLine();

        System.out.println("\n Please Enter your BalanceDetails : ");
        Double balDetails=sc.nextDouble();
        System.out.println();
        BankAccount bnk=new BankAccount(accNo,balDetails,name,emailId,phoneNo,customerId);
        bnk.showMenu();


        //Using constructor
//        BankAccount b = new BankAccount("1893287", 4355.083, "Sangita Mahanta",
//                "mikibbl2014@gmail","8895348784","BA0024" );
//        b.showMenu();
//        System.out.println("Employee name is:" + b.getName());
//        System.out.println("Employee Acc_num is:" + b.getAccount_Num());
//        System.out.println("Employee Acc_Balance is:" + b.getBalance());
//        System.out.println("Employee Employee_Id is:" + b.getE_mail());
//        System.out.println("Employee Employee_phoneNO is:" + b.getPhone_no());
//        b.deposit(1238.0);
//        b.withdrawal(5593.083);

    }
}
