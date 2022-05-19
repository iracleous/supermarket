package org.example;

public class Main {
    public static void main(String[] args) {
        Shelf shelf =  new Shelf(12, 10);
        shelf.addProduct(new Product("blue","Chocolate",1.20));
        shelf.addProduct(new Product("red","Wafer",0.80));
        shelf.addProduct(new Product("brown","Chicklet",2.30));
        shelf.addProduct(new Product("white","Biscuit",1.1));
        shelf.addProduct(new Product("red","Candy", 0.30));
        shelf.addProduct(new Product("red","Candy", 0.30));
        System.out.println(shelf.getProduct(3));
        System.out.println(shelf.getProduct(5));
        System.out.println("End");
    }
}