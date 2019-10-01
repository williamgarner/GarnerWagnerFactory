package abstractfactory.componentfactories;

import abstractfactory.components.*;

public class WABonusComponentFactory extends SlotComponentFactory {
    @Override
    public Cabinet createCabinet() {
        return new MediumCabinet();
    }

    @Override
    public Payment createPayment() {
        return new TicketPayment();
    }

    @Override
    public Display createDisplay() {
        return new VGADisplay();
    }

    @Override
    public GPU createGPU() {
        return new ARMGPU();
    }

    @Override
    public OS createOS() {
        return new SymbianOS();
    }
}
