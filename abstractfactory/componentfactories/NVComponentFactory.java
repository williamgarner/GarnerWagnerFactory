package abstractfactory.componentfactories;

import abstractfactory.components.*;

public class NVComponentFactory extends SlotComponentFactory {
    @Override
    public Cabinet createCabinet() {
        return null;
    }

    @Override
    public Payment createPayment() {
        return null;
    }

    @Override
    public Display createDisplay() {
        return null;
    }

    @Override
    public GPU createGPU() {
        return null;
    }

    @Override
    public OS createOS() {
        return null;
    }
}
