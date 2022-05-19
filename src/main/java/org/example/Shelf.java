package org.example;

import java.util.ArrayList;

public class Shelf {

    private int shelvesNumber;
    private int maximumProducts;
    private ArrayList<Product> products;


    public Shelf(int shelvesNumber, int maximumProducts){
        this.shelvesNumber = shelvesNumber;
        this.maximumProducts = maximumProducts;
        products = new ArrayList<>();


    }

    //create, read, update, delete  CRUD

    public void addProduct(Product productName){
        if ( products.size() >= maximumProducts){
            System.out.println("Shelf limit has been reached");
        }
        else
            products.add(productName);
    }

    public Product getProduct(int index){
        if (index < 0 || index >= products.size()){
            System.out.println("The product does not exist");
            return null;
        }
        else
            return products.get(index);
    }


    public void showList(){
       for (int i = 0;i < products.size(); i++){
           System.out.println(i + " -> " +products.get(i));       }
    }
}
