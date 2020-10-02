package org.objects.constructor;

public class LaptopDiscount {
    protected String name;
    protected int price;
    private double discount;
    private  double amount;

    public LaptopDiscount(){
        //default constructor
     }

    public LaptopDiscount(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void compute()
    {
        if (price<=25000)
            this.discount=price*0.05;
            else if (price>25000 || price<=50000)
                this.discount=price*0.07;
            else if (price>50000||price<=1000000)
                this.discount=price*0.1;
            else
                this.discount=price*0.15;

            this.amount=this.price-this.discount;

    }
    public void compute(LaptopDiscount laptopDiscount1)
    {
        if (price<=25000)
            this.discount=price*0.05;
            else if (price>25000 || price<=50000)
                this.discount=price*0.07;
            else if (price>50000||price<=1000000)
                this.discount=price*0.1;
            else
                this.discount=price*0.15;

            this.amount=this.price-this.discount;

    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void display(){
        System.out.println("Name is : "+name);
        System.out.println("Discount is : "+discount);
        System.out.println("Total amount to paid to buy a laptop is : "+amount);

    }
}
