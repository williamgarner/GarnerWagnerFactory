package abstractfactory.slots;

import abstractfactory.componentfactories.SlotComponentFactory;

public class WAProgressiveSlot extends Slot {
    SlotComponentFactory slotComponentFactory;

    public WAProgressiveSlot(SlotComponentFactory slotComponentFactory) {
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
