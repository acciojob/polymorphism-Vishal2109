package com.driver;

public class Main {

    static class Product{
        public Product(){}

        public int product(int x, int y) {return 0;}
        public int product(int x, int y, int z) {return 0;}
        public double product(double x, double y) {return 0.0d;}


    }

    public static void main(String[] args) {
        Product p = new Product();

        p.product(0,0);
        p.product(0,0,0);
        p.product(0.0d, 0.0d);

    }
}