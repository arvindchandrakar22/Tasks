package com.practice.java_streams;

import java.util.ArrayList;
import java.util.List;

class Product
{
    int id;
    String name;
    double price;
    public Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Demo4Filters {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"HP Laptop",25000));
        productList.add(new Product(1,"Lenovo Laptop",30000));
        productList.add(new Product(1,"Dell Laptop",28000));
        productList.add(new Product(1,"Sony Laptop",23000));
        productList.add(new Product(1,"Apple Laptop",90000));

        productList.stream()
                .filter(p->p.price>25000)
                .forEach(pr-> System.out.println(pr.price));
    }
}
