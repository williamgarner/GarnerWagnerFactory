package abstractfactory.slots;

import abstractfactory.components.*;

public abstract class Slot {
    public Cabinet cabinet;
    public Payment payment;
    public Display display;
    public GPU gpu;
    public OS os;

    public abstract void assemble();
}
