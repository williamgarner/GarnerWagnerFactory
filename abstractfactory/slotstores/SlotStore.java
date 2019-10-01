package abstractfactory.slotstores;

import abstractfactory.slots.Slot;

public abstract class SlotStore {
    Slot slot;

    public Slot orderSlot(String type)
    {
        slot = createSlot(type);
        slot.assemble();
        return slot;
    }

    protected abstract Slot createSlot(String type);
}
