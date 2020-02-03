package com.company.adapter;

import com.company.adapter.superFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new FilterAdapter(new Caramel()));
    }
}
