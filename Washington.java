package com.company;

public class Washington extends SlotStore {
    @Override
    protected Slot createSlot(String type) {
        switch (type) {
            case "straight":
                return new WAStraight();
            case "bonus":
                return new WABonus();
            case "progressive":
                return new WAProgressive();
            default:
                return null;
        }
    }
}
