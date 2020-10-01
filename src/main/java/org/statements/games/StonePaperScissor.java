package org.statements.games;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {
    public static int computerChoice;
    public static int i;
    public static int computerPoint;
    public static int userPoint;

    public static void main(String[] args) {
        System.out.println("\n***********WELCOME TO OUR ROCK,PAPER AND SCISSOR GAME*************");
        Random rand=new Random();

        Scanner sc=new Scanner(System.in);
        while (i <= 10) {
            System.out.println("The Choice are Available :- ");
            System.out.println("\t\t\t\t\t\t 1. STONE ");
            System.out.println("\t\t\t\t\t\t 2. PAPER ");
            System.out.println("\t\t\t\t\t\t 3. SCISSOR  ");
            System.out.println("--------------------------------------");
            System.out.println(" Enter Your choice : ");
            int userChoice=sc.nextInt();
            System.out.println();

            switch (userChoice){
                case 1:
                    System.out.println("User choose Stone ");
                    break;
                case 2:
                    System.out.println("User choose Paper ");
                    break;
                case 3:
                    System.out.println("User choose Scissor ");
                    break;
                default:
                    System.out.println("Please !!! Enter a Valid Choose....\n");
                    continue;

            }

            switch (computerChoice=(1+rand.nextInt(3))){
                case 1:
                    System.out.println("Computer choose Stone \n ");
                    break;
                case 2:
                    System.out.println("Computer choose Paper \n");
                    break;
                case 3:
                    System.out.println("Computer choose Scissor \n");
                    break;

            }

//            System.out.println("\nTo show the computer choice : "+computerChoice+"\n");

            if(userChoice==computerChoice)
            {
                System.out.println("The Game is Tie..");
                System.out.println();
            }

            else if (userChoice == 1 && computerChoice == 2){
                System.out.println("Computer bit the User..");
                System.out.println("Computer Own \n");
                computerPoint+=1;
            }

            else if (userChoice == 1 && computerChoice == 3){
                System.out.println("User bit the Computer..");
                System.out.println("User Own \n");
                userPoint+=1;
            }
            else if (userChoice == 2 && computerChoice == 1){
                System.out.println("User bit the Computer..");
                System.out.println("User Own \n");
                userPoint+=1;

            }
            else if (userChoice == 2 && computerChoice == 3){
                System.out.println("Computer bit the User..");
                System.out.println("Computer Own \n");
                computerPoint+=1;

            }
            else if (userChoice == 3 && computerChoice == 1){
                System.out.println("Computer bit the User..");
                System.out.println("Computer Own \n");
                computerPoint+=1;

            }
            else if (userChoice == 3 && computerChoice == 2){
                System.out.println("User bit the Computer..");
                System.out.println("User Own \n");
                userPoint+=1;

            }

            i+=1;

        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Game Over!!!\n");

        if(computerPoint>userPoint){
            System.out.println("Computer wins and you loose the game!!!...");
        }
        else if (computerPoint<userPoint){
            System.out.println("You wins and computer loose the game!!!...");
        }
        else
            System.out.println();

        System.out.println("Yours points is  "+userPoint+" and Computer points is "+computerPoint);


    }

}
