package abstractfactory.slotstores;

import abstractfactory.Slot;
import abstractfactory.componentfactories.NJComponentFactory;
import abstractfactory.componentfactories.SlotComponentFactory;

public class NJSlotStore extends SlotStore {
    SlotComponentFactory slotComponentFactory = new NJComponentFactory();

    @Override
    protected Slot createSlot(String type) {
        return null;
    }
}
