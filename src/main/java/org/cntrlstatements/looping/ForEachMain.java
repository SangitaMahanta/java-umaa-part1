package org.cntrlstatements.looping;

public class ForEachMain {
    private final static String namesArr[] = {"miki", "raja", "sumi", "bablu", "bibhu"};

    public static void main(String[] args) {
        displayWithForEach();
        displayWithFor();
        displayWithWhile();
        displayWithDoWhile();

    }

    //foreach loop
    private static void displayWithForEach() {
        for (String strName : namesArr
        ) {
            System.out.println(strName);
        }
        System.out.println("With foreach loop done..");
    }


//    forloop

    private static void displayWithFor() {
        System.out.println("--------------------------------");
        for (int index = 0; index < namesArr.length; index++) {
            System.out.println(namesArr[index]);
        }
        System.out.println("With for loop done..");

    }

    // with while
    private static void displayWithWhile() {
        System.out.println("--------------------------------");
        int index = 0;
        while (index < namesArr.length) {
            System.out.println(namesArr[index]);
            index += 1;
        }
        System.out.println("With while loop done..");

    }

    // with do-while
    private static void displayWithDoWhile() {
        System.out.println("--------------------------------");
        int index = 0;
        do {
            System.out.println(namesArr[index]);
            index++;
        }
        while (index < namesArr.length);
        System.out.println("With do-while loop done..");

    }
}