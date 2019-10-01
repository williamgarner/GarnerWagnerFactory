package abstractfactory.slotstores;

import abstractfactory.Slot;
import abstractfactory.componentfactories.*;

public class NVSlotStore extends SlotStore {
    SlotComponentFactory slotComponentFactory = new NVComponentFactory();

    @Override
    protected Slot createSlot(String type) {
        return null;
    }
}
