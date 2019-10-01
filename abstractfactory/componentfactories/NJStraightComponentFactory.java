package abstractfactory.componentfactories;

import abstractfactory.components.*;

public class NJStraightComponentFactory extends SlotComponentFactory {
    @Override
    public Cabinet createCabinet() {
        return new SmallCabinet();
    }

    @Override
    public Payment createPayment() {
        return new CoinsPayment();
    }

    @Override
    public Display createDisplay() {
        return new LCDDisplay();
    }

    @Override
    public GPU createGPU() {
        return new ARMGPU();
    }

    @Override
    public OS createOS() {
        return new WindowsMEOS();
    }
}
