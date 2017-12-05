package multithreading2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Threads {
    private boolean ready;
    private Iterable<String> list;

    public Threads(Iterable<String> list) {
        this.list = list;
    }

    public static void main(String[] args) throws InterruptedException {
//клиент

        BlockingQueue<String> orders = new LinkedBlockingDeque<>();
        BlockingQueue<String> dishes = new LinkedBlockingDeque<>();

        new Waiter(orders, dishes).start();

        for (int i = 0; i < 10; i++) {
            orders.add(String.valueOf(i));
        }

        while (true) {
            String dish = dishes.take();

            System.out.println("Client got dish: " + dish);
        }
    }
    private void waiter(){
//официант
        for (String s : list) {
            System.out.println(s);
        }
    }
    private void  cooker(){
//повар

    }

    private static class Waiter extends Thread {
        private final BlockingQueue<String> orders;
        private final BlockingQueue<String> dishes;

        private Waiter(BlockingQueue<String> orders, BlockingQueue<String> dishes) {
            this.orders = orders;
            this.dishes = dishes;
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    String order = orders.take();

                    System.out.println("Got order! " + order);

                    sleep(500);

                    dishes.add("dish " + order);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
