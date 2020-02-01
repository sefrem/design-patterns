package com.company.iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private int count = 0;
    private static final int CAPACITY = 3;
    private String[] urls = new String[10];

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

   public Iterator createIterator() {
        return new ArrayIterator(this);
   }

    public class ArrayIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

//    public class ListIterator implements Iterator {
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }
}
