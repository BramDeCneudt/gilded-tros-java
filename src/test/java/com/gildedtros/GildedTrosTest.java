package com.gildedtros;

import com.gildedtros.external.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedTrosTest {

    @Test
    void Given_AnItemWithPositiveSellIn_When_UpdateInQualityIsTriggered_Then_QualityShouldDegradeNormally() {
        String itemName = "Normal Item";
        Item[] items = new Item[] { new Item(itemName, 5, 20) };
        GildedTros app = new GildedTros(items);

        app.updateQuality();

        assertEquals(itemName, app.items[0].name);
        assertEquals(19, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
    }

    @Test
    void Given_AnItemWithZeroSellIn_When_UpdateInQualityIsTriggered_Then_QualityShouldDegradeTwiceAsFast() {
        String itemName = "Degraded Item";
        Item[] items = new Item[] { new Item(itemName, 0, 20) };
        GildedTros app = new GildedTros(items);

        app.updateQuality();

        assertEquals(itemName, app.items[0].name);
        assertEquals(18, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }


    @Test
    void Given_AnItemWithZeroQualityButPositiveSellIn_When_UpdateInQualityIsTriggered_Then_QualityShouldRemainAtZero() {
        String itemName = "Zero Quality Item";
        Item[] items = new Item[] { new Item(itemName, 5, 0) };
        GildedTros app = new GildedTros(items);

        app.updateQuality();

        assertEquals(itemName, app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
    }

    @Test
    void Given_AnItemWithZeroQualityAndNegativeSellIn_When_UpdateInQualityIsTriggered_Then_QualityShouldRemainAtZero() {
        String itemName = "Zero Degraded Quality Item";
        Item[] items = new Item[] { new Item(itemName, -5, 0) };
        GildedTros app = new GildedTros(items);

        app.updateQuality();

        assertEquals(itemName, app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-6, app.items[0].sellIn);
    }

}
