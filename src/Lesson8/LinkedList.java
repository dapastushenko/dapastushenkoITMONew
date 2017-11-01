package Lesson8;

import java.util.Iterator;


public class LinkedList implements List {
    Item head;

    @Override
    public void add(Object value) {
        if (head == null) {
            head = new Item(value);
            return;
        }
        findItem(-1).nextItem = new Item(value);
    }

    @Override
    public Object get(int idx) {
        Item res = findItem(idx);

        return res == null ? -1 : res.value;
    }

    @Override
    public Object remove(int idx) {
        if (head == null)
            return -1;

        if (idx == 0) {
            Object val = head.value;

            head = head.nextItem;

            return val;
        }

        Item prev = findItem(idx - 1);

        if (prev != null) {
            Item cur = prev.nextItem;

            if (cur != null) {
                prev.nextItem = prev.nextItem.nextItem;

                return cur.value;
            }
        }

        return -1;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator(head);
    }

    private static class LinkedListIterator implements Iterator {
        private Item nextItem;

        private LinkedListIterator(Item nextItem) {
            this.nextItem = nextItem;
        }

        @Override
        public boolean hasNext() {
            return nextItem != null;
        }

        @Override
        public Object next() {
            Object res = nextItem.value;
            nextItem = nextItem.nextItem;
            return res;

        }

        public LinkedListIterator() {
        }
    }

    /*
    Служебный класс
     */

    private Item findItem(int idx) {
        if (idx == 0)
            return head;

        int count = 0;

        Item item = head;

        while (item != null) {
            if (count++ == idx)
                return item;

            if (idx < 0 && item.nextItem == null)
                return item;

            item = item.nextItem;
        }

        return null;
    }
}
