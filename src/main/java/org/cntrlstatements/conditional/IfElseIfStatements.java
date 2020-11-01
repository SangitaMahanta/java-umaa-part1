package org.cntrlstatements.conditional;

public class IfElseIfStatements {
//    3 * 5 = 15
//    n % 3 = fuzzy
//    n % 5 = buzzy
//    n % 15 = fuzzybuzzy

    public static void main(String[] args) {
        displayResult();
    }

    private static void evaluateDecision(int n){
        if(n % 15 == 0){
            System.out.println("FuzzyBuzzy");
        }
        else if(n % 5 == 0){
            System.out.println("Buzzy");
        }
        else if(n % 3 == 0){
            System.out.println("Fuzzy");
        }
        else {
            System.out.println(" Invalid Number...!");
        }
        System.out.println("Done..");
    }

    private static void displayResult(){
        int x=25;
        evaluateDecision(x);
    }
}


