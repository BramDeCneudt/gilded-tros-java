package com.gildedtros.strategy;

import com.gildedtros.external.Item;

public class StrategyService {

    private static final String GOOD_WINE_NAME = "Good Wine";
    private static final String LEGENDARY_NAME = "B-DAWG Keychain";
    private static final String BACKSTAGE_PASSES_NAME = "Backstage passes for";

    private static final String SMELLY_ITEM_DUPLICATE_CODE_NAME = "Duplicate Code";
    private static final String SMELLY_ITEM_LONG_METHODS_NAME = "Long Methods";
    private static final String SMELLY_ITEM_UGLY_VARIABLE_NAMES_NAME = "Ugly Variable Names";

    public Strategy generateStrategy(Item item) {
            switch (item.name) {
                case SMELLY_ITEM_DUPLICATE_CODE_NAME, SMELLY_ITEM_LONG_METHODS_NAME, SMELLY_ITEM_UGLY_VARIABLE_NAMES_NAME -> {
                    return new SmellyStrategy();
                }
                case String s when s.startsWith(BACKSTAGE_PASSES_NAME) -> {
                    return new BackstagePassesStrategy();
                }
                case LEGENDARY_NAME  -> {
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
