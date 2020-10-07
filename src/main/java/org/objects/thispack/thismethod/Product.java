package org.objects.thispack.thismethod;

public class Product {
        private int id;
        private String name;
        private int price;

        public Product(int price) {
            // discount
            this.price = price - 10;
            System.out.println(this.hashCode());
        }

        public Product(int id, String name, int price) {
            this(price);
            this.id = id;
            this.name = name;
            System.out.println(this.hashCode());
//             this.price = price;
//              new Product();
            display(this);
        }

        public void display()
        {
            //  this(this.price); compilation error, this() can be the first statement in constructor body
            System.out.println(this.id);
            System.out.println(this.name);
            System.out.println(this.price);
        }

        public void display(Product p)
        {
            display();
        }
}
