package abstractfactory.slots;

import abstractfactory.componentfactories.SlotComponentFactory;

public class NVProgressiveSLot extends Slot {
    SlotComponentFactory slotComponentFactory;

    public NVProgressiveSLot(SlotComponentFactory slotComponentFactory) {
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
