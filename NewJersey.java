package com.company;

public class NewJersey extends SlotStore {
    @Override
    protected Slot createSlot(String type) {
        switch (type) {
            case "straight":
                return new NJStraight();
            case "bonus":
                return new NJBonus();
            case "progressive":
                return new NJProgressive();
            default:
                return null;

        }
    }
}
