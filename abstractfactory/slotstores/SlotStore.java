package abstractfactory.slotstores;

import abstractfactory.componentfactories.SlotComponentFactory;
import abstractfactory.Slot;

public abstract class SlotStore {
    Slot slot;

    public Slot orderSlot(String type)
    {
        slot = createSlot(type);
        return slot;
    }

    protected abstract Slot createSlot(String type);
}
