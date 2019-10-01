package abstractfactory.componentfactories;

import abstractfactory.components.*;

public class NVProgressiveComponentFactory extends SlotComponentFactory {
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
        return new LCDDisplay();
    }

    @Override
    public GPU createGPU() {
        return new X77GPU();
    }

    @Override
    public OS createOS() {
        return new AndroidOS();
    }
}
