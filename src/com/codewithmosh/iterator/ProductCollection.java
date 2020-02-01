package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Product pop() {
    var lasIndex = products.size() - 1;
    var lastItem = products.get(lasIndex);
    products.remove(lastItem);

    return lastItem;
  }


  public Iterator CreateProductListIterator() {
    return new ProductIterator(this);
  }



  public class ProductIterator implements Iterator<Product> {
    private ProductCollection collection;
    private int index;

      public ProductIterator(ProductCollection collection) {
        this.collection = collection;
      }

    @Override
    public boolean hasNext() {
      return (index < collection.products.size());
    }

    @Override
    public  Product current() {
      return collection.products.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }
  }
