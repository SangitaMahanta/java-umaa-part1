//package org.assignment.activity5;
//
//public class Test {
//    static int x;
//    String y;
//
//    static {
//        System.out.println("In static block value of x is "+x);
////        System.out.println("In static block value of y is "+y); // compile time error
//    }
//
//    {
//        System.out.println("Inside non-static block.."); // this non-static  block is executed at the time of object creation of this class.
//        System.out.println("In non-static block value of x is "+x);
//        System.out.println("In non-static block value of y is "+y); // before object creation the value of x and y are not printed.
//    }
//    public static void main(String[] args) {
//        System.out.println("Inside main() value of x = "+x);
////       System.out.println("Inside main() value of y = "+y); // non-static variable y ,we can't access static method main()
//        Test var = new Test(); // creating object of  class Test
//        var.m2();
//        m1();
//    }
//
//   public static void m1() // static method
//   {
//       System.out.println("In static method m1()  x ="+x);
////       System.out.println("In static method m1()  y = "+y); // compile time error ,we can't access non-static variable inside a static method m1().
//   }
//   public void m2() // non-static method
//   {
//       System.out.println("In non-static method m2() x = "+x);
//       System.out.println("In non-static method m2()  y = "+y);
//
//   }
//}
