package com.examly;

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter product id");
        int productId = sc.nextInt();
        sc.nextLine();
        System.out.println("enter product name");
        String productName = sc.nextLine();
        System.out.println("enter category");
        String category = sc.nextLine();
        System.out.println("enter price");
        double price = sc.nextDouble();
        Product p = new Product();
        p.setProductId(productId);
        p.setProductName(productName);
        p.setCategory(category);
        p.setPrice(price);
        System.out.println(p.getProductId());
        System.out.println(p.getProductName());
        System.out.println(p.getCategory());
        if(price>0){
        System.out.println(p.getPrice());
        }else{
            System.out.println("invalid price");

        }

    }
}

class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
                + ", price=" + price + ", getProductId()=" + getProductId() + ", getProductName()=" + getProductName()
                + ", getCategory()=" + getCategory() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}