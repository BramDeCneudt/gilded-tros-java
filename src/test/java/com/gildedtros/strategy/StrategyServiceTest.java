package com.gildedtros.strategy;

import com.gildedtros.external.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyServiceTest {

    private final StrategyService strategyService = new StrategyService();

    @Test
    void Given_AnDefaultItem_When_TriggeringGenerateStrategy_Then_GenerateStrategyShouldReturnDefaultStrategy() {
        String itemName = "Normal Item";
        Item item = new Item(itemName, 5, 20);

        var strategy = strategyService.generateStrategy(item);

        assertEquals(DefaultStrategy.class, strategy.getClass());
    }


    @Test
    void Given_AnGoodWineItem_When_TriggeringGenerateStrategy_Then_GenerateStrategyShouldReturnGoodWineStrategy() {
        String itemName = "Good Wine";
        Item item = new Item(itemName, 5, 20);

        var strategy = strategyService.generateStrategy(item);

        assertEquals(GoodWineStrategy.class, strategy.getClass());
    }

    @Test
    void Given_AnLegendaryItem_When_TriggeringGenerateStrategy_Then_GenerateStrategyShouldReturnLegendaryStrategy() {
        String itemName = "B-DAWG Keychain";
        Item item = new Item(itemName, 5, 20);

        var strategy = strategyService.generateStrategy(item);

        assertEquals(LegendaryStrategy.class, strategy.getClass());
    }

    @Test
    void Given_AnBackstagePassItem_When_TriggeringGenerateStrategy_Then_GenerateStrategyShouldReturnBackstagePassesStrategy(){
        String itemName = "Backstage passes for Re:Factor";
        Item item = new Item(itemName, 5, 20);

        var strategy = strategyService.generateStrategy(item);

        assertEquals(BackstagePassesStrategy.class, strategy.getClass());
    }

    @Test
    void Given_AnSmellyItem_When_TriggeringGenerateStrategy_Then_GenerateStrategyShouldReturnSmellyStrategy(){
        String itemName = "Long Methods";
        Item item = new Item(itemName, 5, 20);

        var strategy = strategyService.generateStrategy(item);

        assertEquals(SmellyStrategy.class, strategy.getClass());
    }

}