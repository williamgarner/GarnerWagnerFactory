package abstractfactory.componentfactories;

import abstractfactory.components.*;

public class NJProgressiveComponentFactory extends SlotComponentFactory {
    @Override
    public Cabinet createCabinet() {
        return new SmallCabinet();
    }

    @Override
    public Payment createPayment() {
        return new BillsPayment();
    }

    @Override
    public Display createDisplay() {
        return new CRTDisplay();
    }

    @Override
    public GPU createGPU() {
        return new X86GPU();
    }

    @Override
    public OS createOS() {
        return new WindowsXPOS();
    }
}
