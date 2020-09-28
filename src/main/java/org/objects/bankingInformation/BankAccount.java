package org.objects.bankingInformation;

import java.util.Scanner;


    import java.util.Scanner;

    public class BankAccount {
        private String accountNum;
        private double balance;
        private double previousTransaction;
        private String CustomerName;
        private String CustomerId;
        private String e_mail;
        private String phoneNo;

        public BankAccount(String accountNum, double balance, String CustomerName, String e_mail, String phoneNo,String CustomerId)
        {
            this.accountNum = accountNum;
            this.balance = balance;
            this.CustomerName = CustomerName;
            this.e_mail = e_mail;
            this.phoneNo = phoneNo;
            this.CustomerId=CustomerId;
        }

//        public String getAccount_Num() {
//            return accountNum;
//        }
//
//        public double getBalance() {
//            return balance;
//        }
//
//        public String getName() {
//            return CustomerName;
//        }
//
//        public String getE_mail() {
//            return e_mail;
//        }
//
//        public String getPhone_no() {
//            return phoneNo;
//        }
        public void deposit(double balance)
        {

            if(balance!=0){
                this.balance=this.balance+balance;
                previousTransaction=balance;
                System.out.println("The updated Balance is:"+this.balance);

            }
        }

        public void withdrawal(double balance)
        {
            if(balance!=0)//if withdraw amount is not zero.
            {
                if (balance>this.balance)
                {
                    System.out.println("Insufficient Balance");
                }
                else if (balance==this.balance)
                {
                    this.balance=this.balance-balance;
                    System.out.println("Successfully withdrawal");
                    previousTransaction=-balance;
                    System.out.println("Now the Acc_Balance is: "+this.balance);
                }
                else
                {
                    this.balance=this.balance-balance;
                    previousTransaction=-balance;
                    System.out.println("After withdrawal the current Balance is:"+this.balance);
                }}
        }

        void getPreviousTransaction(){
            if (previousTransaction>0)
                System.out.println("Deposited : "+previousTransaction);

            else if (previousTransaction<0)
                System.out.println("Withdrawn : "+Math.abs(previousTransaction));

            else
                System.out.println("No Transaction occur");
        }
        void showMenu()
        {
            char option='\0';
            Scanner sc=new Scanner(System.in);
            System.out.println("WelCome "+CustomerName);
            System.out.println("Your Id is "+CustomerId);
            System.out.println("\n");
            System.out.println("Option Available : ");
            System.out.println("A. CheckBalance ");
            System.out.println("B. Deposit ");
            System.out.println("C. Withdraw ");
            System.out.println("D. PreviousTransaction ");
            System.out.println("E. Exit ");


            do {
                System.out.println("=================================================");
                System.out.println("Enter an Option ");
                System.out.println("=================================================");
                option=sc.next().charAt(0);
                System.out.println("\n");

                switch (option)
                {
                    case 'A':
                        System.out.println("---------------------------------------------");
                        System.out.println("Balance ="+balance);
                        System.out.println("---------------------------------------------");
                        System.out.println("\n");
                        break;
                    case 'B':
                        System.out.println("The current Balance is:"+this.balance);
                        System.out.println("---------------------------------------------");
                        System.out.println("Enter an Amount to Deposit ");
                        System.out.println("---------------------------------------------");
                        double amount=sc.nextDouble();
                        deposit(amount);
                        System.out.println("\n");
                        break;
                    case 'C':
                        System.out.println("---------------------------------------------");
                        System.out.println("Enter an Amount to Withdraw");
                        System.out.println("---------------------------------------------");
                        double amount1=sc.nextDouble();
                        withdrawal(amount1);
                        System.out.println("\n");
                        break;
                    case 'D':
                        System.out.println("---------------------------------------------");
                        getPreviousTransaction();
                        System.out.println("---------------------------------------------");
                        System.out.println("\n");
                        break;
                    case 'E':
                        System.out.println("*********************************************");
                        break;
                    default:
                        System.out.println("Invalid Option!!! Please Enter Again ");
                        break;
                }
            }while (option !='E');
            System.out.println("Thank You ! For using our services...");

        }
    }


