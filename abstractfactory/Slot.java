package abstractfactory;

import abstractfactory.components.*;

public abstract class Slot {
    Cabinet cabinet;
    Payment payment;
    Display display;
    GPU gpu;
    OS os;

    public abstract String toString();
}
