package org.assignment.productpkg;

public class Product {
    private String fruit;
    private double amount;
    private double price;

    Product(String fruit, double amount, double price) {
        this(amount, price);
        this.fruit = fruit;
        display(this);

    }

    Product(double amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    void display(Product t) {
        System.out.println("Fruit name is = " + fruit + " of amount = " + amount + " is of price =" + price);

    }

    @Override
    public String toString() {
        return "Product{" +
                "fruit='" + fruit + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }


    public static void main(String[] args) {
        Product product = new Product("Apple", 2.5, 400);
        System.out.println("--------------------------------------------------------");
        String result = product.toString();
        System.out.println(result);
        System.out.println("--------------------------------------------------------");
        Product product1=new Product("Orange",3,350);


    }
}
