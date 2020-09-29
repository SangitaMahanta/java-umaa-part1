package org.variables.constant;

import java.util.Scanner;

public class ConstantVariableDemo {
    static  String candidateName;

    final int age=18;//instance constant

    public static void main(String[] args) {
        ConstantVariableDemo constant=new ConstantVariableDemo();
        Scanner sc=new Scanner(System.in);
        System.out.println("*********Welcome to our VOTE Eligible System******** \n");

        System.out.print("Enter Candidate Name : ");
        candidateName=sc.nextLine();

        System.out.print("Enter Candidate Age : ");
        int candidateAge=sc.nextInt();

        constant.voterEligible(candidateAge);


    }
    public void voterEligible(int candidateAge){
        if(candidateAge>=age)
            System.out.println("Congrats ! You are Eligible for Voting...");
        else
            System.out.println("SORRY ! You are not Eligible for Voting...");
    }
}
