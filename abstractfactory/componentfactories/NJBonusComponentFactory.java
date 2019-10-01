package abstractfactory.componentfactories;

import abstractfactory.components.*;

public class NJBonusComponentFactory extends SlotComponentFactory {
    @Override
    public Cabinet createCabinet() {
        return new LargeCabinet();
    }

    @Override
    public Payment createPayment() {
        return new CoinsPayment();
    }

    @Override
    public Display createDisplay() {
        return new ReelsDisplay();
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
