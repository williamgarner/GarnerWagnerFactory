package com.company;

public class Nevada extends SlotStore {

    @Override
    protected Slot createSlot(String type) {
        switch (type)
        {
            case "straight":
                return new NVStraight();
            case "bonus":
                return new NVBonus();
            case "progressive":
                return new NVProgressive();
            default:
                return null;
        }
    }
}
