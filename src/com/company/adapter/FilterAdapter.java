package com.company.adapter;

import com.company.adapter.superFilters.Caramel;

public class FilterAdapter implements Filter{
    private Caramel caramel;

    public FilterAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
