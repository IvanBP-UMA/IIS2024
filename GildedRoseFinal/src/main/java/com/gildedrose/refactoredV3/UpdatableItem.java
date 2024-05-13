package com.gildedrose.refactoredV3;

public abstract class UpdatableItem extends Item{
    public UpdatableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public abstract void update();
}
