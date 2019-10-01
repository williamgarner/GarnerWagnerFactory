package factorymethod;

public class Main {
    static void printSlot(Slot slot)
    {
        System.out.print(slot.cabinet + " ");
        System.out.print(slot.payment + " ");
        System.out.print(slot.display + " ");
        System.out.print(slot.gpu + " ");
        System.out.println(slot.os);
    }

    public static void main(String[] args) {
        SlotStore store = new Nevada();
        Slot slot = store.orderSlot("bonus");
        System.out.println("Nevada Bonus");
        printSlot(slot);

        slot = store.orderSlot("progressive");
        System.out.println("Nevada Progressive");
        printSlot(slot);

        store = new Washington();
        slot = store.orderSlot("straight");
        System.out.println("Washington Straight");
        printSlot(slot);

	// write your code here
    }
}
