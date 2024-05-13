package com.gildedrose.refactoredV3;

public class AgedBrie extends UpdatableItem{
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        return;
    }
}
