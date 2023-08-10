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

        int x = p.Product(1,2);
        int y = p.Product(1,2,3);
        double z = p.Product(1.1,2.2);
    }
}