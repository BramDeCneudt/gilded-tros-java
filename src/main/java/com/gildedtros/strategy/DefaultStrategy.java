package com.gildedtros.strategy;

import com.gildedtros.external.Item;

public class DefaultStrategy implements Strategy {

    protected final int maxQualityStandardItem = 50;
    protected final int minQualityStandardItem = 0;

    @Override
    public void updateItem(Item item) {
        if (item.sellIn > 0) {
            item.quality -= 1;
        } else {
            item.quality -= 2;
        }
        this.reduceSellInAndCheckMaxAndMinQuality(item);
    }

    /**
     * reduceSellInAndCheckMaxAndMinQuality reduces the sellIn by 1 day
     * and checks if the max and min quality of a standard item has not been exceeded
     * @param item
     */
    protected void reduceSellInAndCheckMaxAndMinQuality(Item item) {
        if (item.quality > this.maxQualityStandardItem) {
            item.quality = this.maxQualityStandardItem;
        }

        if (item.quality < this.minQualityStandardItem) {
            item.quality = this.minQualityStandardItem;
        }

        item.sellIn -= 1;
    }
}
