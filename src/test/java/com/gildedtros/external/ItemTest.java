package com.gildedtros.external;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void seeThatItemDoesNotChangeFunctionality() {
        var itemName = "Normal Item";
        var item = new Item(itemName, 5, 10);

        assertEquals(itemName, item.name);
        assertEquals(5, item.sellIn);
        assertEquals(10, item.quality);
    }

}