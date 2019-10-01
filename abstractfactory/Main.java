package abstractfactory;


import abstractfactory.slots.Slot;
import abstractfactory.slotstores.NVSlotStore;
import abstractfactory.slotstores.SlotStore;
import abstractfactory.slotstores.WASlotStore;

public class Main {
    static void printSlot(Slot slot) {
        System.out.print(slot.cabinet.toString() + ", ");
        System.out.print(slot.payment.toString() + ", ");
        System.out.print(slot.display.toString() + ", ");
        System.out.print(slot.gpu.toString() + ", ");
        System.out.println(slot.os.toString());
    }

    public static void main(String[] args) {
        SlotStore store = new NVSlotStore();
        Slot slot = store.orderSlot("straight");
        System.out.println("Nevada Straight");
        printSlot(slot);

        slot = store.orderSlot("progressive");
        System.out.println("Nevada Progressive");
        printSlot(slot);

        store = new WASlotStore();
        slot = store.orderSlot("bonus");
        System.out.println("Washington Bonus");
        printSlot(slot);
    }
}
