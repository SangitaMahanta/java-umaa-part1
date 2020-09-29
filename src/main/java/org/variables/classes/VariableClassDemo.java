package org.variables.classes;

import java.util.Scanner;

public class VariableClassDemo {
    public static String branchName;
    public  String nameOfStudent;
    public static int ageOfStudent;
    public static int rankOfStudent = 28;
    public String nativePlaceOfStudent = "Bhubaneswar";

    static {
        System.out.println(" STUDENT INFORMATION ");
        System.out.println("STUDENT OF UTKAL UNIVERSITY");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VariableClassDemo var=new VariableClassDemo();

        System.out.print("Enter Name of Student : ");
        var.nameOfStudent=sc.next();

        System.out.print("Enter Age of Student : ");
        ageOfStudent=sc.nextInt();

        System.out.print("Enter BranchName : ");
        branchName=sc.next();
        System.out.println();

        var.studentInfo();

        System.out.println("The Rank  is : "+rankOfStudent);
        System.out.println("The BranchName  is : "+branchName);




    }
    public  void studentInfo(){
        System.out.println("The name of the Student is : "+nameOfStudent);
        System.out.println("The Resident  is : "+nativePlaceOfStudent);
    }

}
