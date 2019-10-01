package abstractfactory.componentfactories;

import abstractfactory.components.*;

public abstract class SlotComponentFactory {
    public abstract Cabinet createCabinet();
    public abstract Payment createPayment();
    public abstract Display createDisplay();
    public abstract GPU createGPU();
    public abstract OS createOS();
}
