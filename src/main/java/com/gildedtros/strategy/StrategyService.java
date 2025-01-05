package com.gildedtros.strategy;

import com.gildedtros.external.Item;

public class StrategyService {

    private static final String GOOD_WINE_NAME = "Good Wine";
    private static final String LEGENDARY_NAME = "B-DAWG Keychain";
    private static final String BACKSTAGE_PASSES_NAME = "Backstage passes for";

    public Strategy generateStrategy(Item item) {
            switch (item.name) {
                case String s when s.startsWith(BACKSTAGE_PASSES_NAME) -> {
                    return new BackstagePassesStrategy();
                }
                case LEGENDARY_NAME -> {
                    return new LegendaryStrategy();
                }
                case GOOD_WINE_NAME -> {
                    return new GoodWineStrategy();
                }
                default -> {
                    return new DefaultStrategy();
                }
            }
    }

}
