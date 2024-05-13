package com.gildedrose.refactored;

class GildedRose {
  public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
  public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
  public static final String AGED_BRIE = "Aged Brie";
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
      updateQuality(items[i]);
      updateSellIn(items[i]);
    }
  }

  /**
   * Updates the quality of an item according to its type
   * @param item to update
   */
  private void updateQuality(Item item){
    switch (item.name){
      case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
        updateQualityBackstage(item);
        break;
      case SULFURAS_HAND_OF_RAGNAROS:
        break;
      case AGED_BRIE:
        updateQualityBrie(item);
        break;
      default:
        updateQualityDefault(item);
    }

  }

  /**
   * Updates the quality of a conventional item with no special rules
   * @param item to update
   */
  private void updateQualityDefault(Item item) {
    if (item.sellIn > 0){
      item.quality--;
    }else{
      item.quality -= 2;
    }

    if (item.quality<0){
      item.quality = 0;
    }
    if (item.quality>50){
      item.quality = 50;
    }
  }

  /**
   * Updates the quality of 'Aged Brie'-type items following their special rules and behaviours
   * @param item to update
   */
  private void updateQualityBrie(Item item) {
    if (item.sellIn > 0){
      item.quality++;
    }else{
      item.quality += 2;
    }

    if (item.quality>50){
      item.quality = 50;
    }
  }

  /**
   * Updates the quality of 'Backstage Pass'-type items following their special rules and behaviours
   * @param item to update
   */
  private void updateQualityBackstage(Item item) {
    if (item.sellIn <= 0){
      item.quality = 0;
    } else if (item.sellIn<6){
      item.quality += 3;
    } else if (item.sellIn<11) {
      item.quality += 2;
    }else{
      item.quality++;
    }

    if (item.quality>50){
      item.quality = 50;
    }
  }

  /**
   * Updates the sellIn property of an item, taking into consideration the Sulfuras exception
   * @param item to update
   */
  private void updateSellIn (Item item){
    if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)){
      item.sellIn--;
    }
  }
}