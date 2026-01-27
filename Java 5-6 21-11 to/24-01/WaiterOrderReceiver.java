class Kitchen {
    void cook(String item) {
        System.out.println("Preparing item for order: " + item);
    }
}

class Waiter extends Kitchen implements Runnable {
    String item;

    Waiter(String item) {
        this.item = item;
    }

    @Override
    public void run() {
        takeOrder();
    }

    void takeOrder() {
        super.cook(item);
    }
}

public class WaiterOrderReceiver {
    public static void main(String[] args) {
        // create multiple waiters
        Waiter w1 = new Waiter("biryani");
        Waiter w2 = new Waiter("chicken curry");
        Waiter w3 = new Waiter("curd rice");

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w3);

        t1.start();
        t2.start();
        t3.start();
    }
}
