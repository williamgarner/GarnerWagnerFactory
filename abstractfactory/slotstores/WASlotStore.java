package abstractfactory.slotstores;

import abstractfactory.componentfactories.*;
import abstractfactory.slots.WABonusSlot;
import abstractfactory.slots.WAProgressiveSlot;
import abstractfactory.slots.WAStraightSlot;
import abstractfactory.slots.Slot;

public class WASlotStore extends SlotStore {
    SlotComponentFactory waStraightComponentFactory = new WAStraightComponentFactory();
    SlotComponentFactory waBonusComponentFactory = new WABonusComponentFactory();
    SlotComponentFactory waProgressiveComponentFactory = new WAProgressiveComponentFactory();

    @Override
    protected Slot createSlot(String type) {
        switch (type) {
            case "straight":
                slot = new WAStraightSlot(waStraightComponentFactory);
                break;
            case "bonus":
                slot = new WABonusSlot(waBonusComponentFactory);
                break;
            case "progressive":
                slot = new WAProgressiveSlot(waProgressiveComponentFactory);
                break;
            default:
                slot = null;
                break;
        }
        return slot;
    }
}
