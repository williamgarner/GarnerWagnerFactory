package abstractfactory.slotstores;

import abstractfactory.componentfactories.SlotComponentFactory;
import abstractfactory.componentfactories.WAComponentFactory;
import abstractfactory.Slot;

public class WASlotStore extends SlotStore {
    SlotComponentFactory slotComponentFactory = new WAComponentFactory();

    @Override
    protected Slot createSlot(String type) {
        return null;
    }
}
