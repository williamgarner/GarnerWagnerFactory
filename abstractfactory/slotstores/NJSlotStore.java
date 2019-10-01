package abstractfactory.slotstores;

import abstractfactory.componentfactories.*;
import abstractfactory.slots.NJBonusSlot;
import abstractfactory.slots.NJProgressiveSlot;
import abstractfactory.slots.NJStraightSlot;
import abstractfactory.slots.Slot;

public class NJSlotStore extends SlotStore {
    SlotComponentFactory njStraightComponentFactory = new NJStraightComponentFactory();
    SlotComponentFactory njBonusComponentFactory = new NJBonusComponentFactory();
    SlotComponentFactory njProgressiveComponentFactory = new NJProgressiveComponentFactory();

    @Override
    protected Slot createSlot(String type) {
        switch (type) {
            case "straight":
                slot = new NJStraightSlot(njStraightComponentFactory);
                break;
            case "bonus":
                slot = new NJBonusSlot(njBonusComponentFactory);
                break;
            case "progressive":
                slot = new NJProgressiveSlot(njProgressiveComponentFactory);
                break;
            default:
                slot = null;
                break;
        }
        return slot;
    }
}
