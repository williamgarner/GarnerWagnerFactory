package abstractfactory.slotstores;

import abstractfactory.slots.NVBonusSlot;
import abstractfactory.slots.NVProgressiveSLot;
import abstractfactory.slots.NVStraightSlot;
import abstractfactory.slots.Slot;
import abstractfactory.componentfactories.*;

public class NVSlotStore extends SlotStore {
    SlotComponentFactory nvStraightComponentFactory = new NVStraightComponentFactory();
    SlotComponentFactory nvBonusComponentFactory = new NVBonusComponentFactory();
    SlotComponentFactory nvProgressiveComponentFactory = new NVProgressiveComponentFactory();

    @Override
    protected Slot createSlot(String type) {
        switch (type) {
            case "straight":
                slot = new NVStraightSlot(nvStraightComponentFactory);
                break;
            case "bonus":
                slot = new NVBonusSlot(nvBonusComponentFactory);
                break;
            case "progressive":
                slot = new NVProgressiveSLot(nvProgressiveComponentFactory);
                break;
            default:
                slot = null;
                break;
        }
        return slot;
    }
}
