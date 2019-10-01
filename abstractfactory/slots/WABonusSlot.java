package abstractfactory.slots;

import abstractfactory.componentfactories.SlotComponentFactory;

public class WABonusSlot extends Slot {
    SlotComponentFactory slotComponentFactory;

    public WABonusSlot(SlotComponentFactory slotComponentFactory) {
        this.slotComponentFactory = slotComponentFactory;
    }

    @Override
    public void assemble() {
        cabinet = slotComponentFactory.createCabinet();
        payment = slotComponentFactory.createPayment();
        display = slotComponentFactory.createDisplay();
        gpu = slotComponentFactory.createGPU();
        os = slotComponentFactory.createOS();
    }
}
