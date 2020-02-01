package com.codewithmosh.iterator;

public class Main {

    public static void main(String[] args) {
        var listOfProducts = new ProductCollection();
        listOfProducts.add(new Product(1, "Shower gel"));
        listOfProducts.add(new Product(2, "Shampoo"));
        listOfProducts.add(new Product(4, "Puasha's kotik"));
//        listOfProducts.pop();

        Iterator iterator = listOfProducts.CreateProductListIterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.current());
                iterator.next();
            }
    }
}
