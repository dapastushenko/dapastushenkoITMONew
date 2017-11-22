package lesson4.intList;

public class IntList {
    Item head;
    Item nextitem;
    Item endofitem;

    public void add(int i) {

        if (head == null) {
            head = new Item();
        } else {
            if (head.next == null) {
                nextitem = new Item(i);
                head.next = nextitem;
            } else {
                while (nextitem.next != null) {

                    nextitem = nextitem.next;
                }
                endofitem = nextitem;
                Item nextitem = new Item(i);
                endofitem.next = nextitem;
            }
        }

    }

    public Item getItem(int counter) {
        Item foundItem = head;
        for (int i = 0; i <= counter; i++)
            foundItem = foundItem.next;
        return foundItem;

    }
    public void removeItem(int counter){
        Item foundItem = head;
        Item prevItem = head;

        for (int i = 0; i <= counter;i++) {
            if (i == counter - 1) {
                prevItem = foundItem;
            }
            else{
                foundItem=foundItem.next;
            }
        }
        prevItem.next=foundItem.next;
    }
}
