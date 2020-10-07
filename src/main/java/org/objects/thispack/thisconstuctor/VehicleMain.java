package org.objects.thispack.thisconstuctor;

public class VehicleMain {
    VehicleMain(){
        Vehicle v  = new Vehicle(this);
        System.out.println("The registrationState is : "+ v.getRegistrationState());
        System.out.println("The Color of Vehicle is : "+ v.getColor());
    }

    public static void main(String[] args) {

        VehicleMain vehicle=new VehicleMain();
    }
}
