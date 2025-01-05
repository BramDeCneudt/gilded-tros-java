package com.gildedtros.strategy;

import com.gildedtros.external.Item;

public class SmellyStrategy extends DefaultStrategy {
    @Override
    public void updateItem(Item item) {
        if (item.sellIn > 0) {
            item.quality -= 2;
        } else {
            item.quality -= 4;
        }
        this.reduceSellInAndCheckMaxAndMinQuality(item);
    }
}
