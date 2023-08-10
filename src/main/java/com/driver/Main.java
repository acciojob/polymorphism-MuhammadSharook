package com.driver;

public class Main {
    public static class Product
    {
        public Product() {

        }

        public int Product(int x, int y)
        {
            return x * y;
        }

        public int Product(int x,int y,int z) {
            return x * y * z;
        }

        public double Product(double x,double y)
        {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        p.Product(1,2);
        p.Product(1,2,3);
        p.Product(1.0,2.0);
    }
}