package org.variables.local;

public class CubeCalculationDemo {

     static {
          double height=12;//local variable inside static block
          double width=13;
         System.out.println("Inside Static block ");
         System.out.println("Height = "+height+"\n"+"Width = "+width);
         System.out.println();

     }
    {
        double depth=12.6;//local variable inside non-static block
        System.out.println("Inside Non-static block ");
        System.out.println("Depth = "+depth);
        System.out.println();
    }

    public static void main(String[] args) {
         CubeCalculationDemo cube=new CubeCalculationDemo();
         cube.computeVolume();
         cube.computeVolume(34,56,12);
    }
    public void computeVolume(double height,double width,double depth){
        double volume =height*width*depth;
         System.out.println("volume of the cube is : "+volume);

    }
    void computeVolume(){
         double volume=12*13*12.6;
        System.out.println("volume of the  Cube  is : "+volume);
        System.out.println();
    }
}
