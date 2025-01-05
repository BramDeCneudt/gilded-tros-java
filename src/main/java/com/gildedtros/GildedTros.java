package com.gildedtros;

import com.gildedtros.external.Item;
import com.gildedtros.strategy.StrategyService;

class GildedTros {
    final Item[] items;
    final StrategyService strategyService;

    public GildedTros(Item[] items) {
        this.items = items;
        this.strategyService = new StrategyService();
    }

    public void updateQuality() {
        for (Item item : items) {
            var strategy = strategyService.generateStrategy(item);

            strategy.updateItem(item);
        }
    }
}