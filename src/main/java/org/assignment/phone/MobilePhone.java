package org.assignment.phone;

public class MobilePhone {
    // states of mobilephone class
    private String mobName;
    private String mobModel;
    private String mobColor;
    private double mobPrice;


    MobilePhone(String mobName, String mobColor, double mobPrice) {
        //inside constructor initialization of object state
        this.mobName = mobName;
        this.mobColor = mobColor;
        this.mobPrice = mobPrice;
        this.mobileInfo(this); //object behaviour

    }

    public void mobileInfo(MobilePhone mob) {
        mob.mobName = this.mobName;
        this.mobModel = "Android 1951";

        System.out.println(mob.hashCode() == this.hashCode());

        System.out.println("\nThe Mobile Name is : " + mob.mobName);
        System.out.println("The Mobile Name is : " + mobName);
        System.out.println("\nThe Mobile Price is : " + mob.mobPrice);
        System.out.println("The Mobile Price is : " + mobPrice);
        System.out.println("\nThe Mobile Model is : " + mob.mobModel);
        System.out.println("The Mobile Model is : " + mobModel);
        System.out.println("\nThe Mobile Color is : " + mob.mobColor);
        System.out.println("The Mobile Color is : " + mobColor);

        System.out.println("\nAfter discount The cost is : " + discount(this) + "\n \n");
        System.out.println("----------------------------------------------------------------------------------------");

    }

    public double discount(MobilePhone t1) {

        return t1.mobPrice = mobPrice - 500;

    }

}
