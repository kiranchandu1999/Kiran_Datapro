class Order {
    String orderId;
    String customerName;

    Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    // non static class (inner class)
    class Item {
        String itemName;
        int qty;

        Item(String itemName, int qty) {
            this.itemName = itemName;
            this.qty = qty;
        }

        void printDetails() {
            System.out.println("orderId: " + orderId);
            System.out.println("customerName: " + customerName);
            System.out.println("itemName: " + itemName);
            System.out.println("qty: " + qty);
        }
    }

    void display() {
        System.out.println("Outer class diplaying...");
    }

    // static class
    static class Utility {
        void showAppName(String app) {
            System.out.println("Welcome to " + app);
        }

        static void validatedMoney(int amount) {
            if(amount > 0) {
                System.out.println("Valid amount");
            } else {
                System.out.println("Invalid amount");
            }
        }
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        // handling non static nested class (inner class)
        Order order1 = new Order("od101", "Raju");
        Order.Item item1 = order1.new Item("HP keyboard", 2);
        Order.Item item2 = order1.new Item("Logitech mouse", 3);

        order1.display();
        item1.printDetails();
        item2.printDetails();

        // handling static nested class
        Order.Utility util1 = new Order.Utility();
        util1.showAppName("Myntra");

        Order.Utility.validatedMoney(500);
    }
}
