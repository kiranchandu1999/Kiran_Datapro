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
    static class PaymentUtility {
        static void validateAmount(int amount) {
            if(amount > 0) {
                System.out.println("Valid amount");
            }
            else {
                System.out.println("Not a valid amount");
            }
        }
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order order1 = new Order("od101", "Raju");
        Order.Item item = order1.new Item("Redmi 4 mobile", 2);
        item.printDetails();

        order1.display();

        System.out.println(order1.customerName);
        System.out.println(item.itemName);

        // calling static nested class
        // Order.PaymentUtility util = new Order.PaymentUtility();
        // util.validateAmount(500);
        // util.validateAmount(-1000);

        Order.PaymentUtility.validateAmount(500);
        Order.PaymentUtility.validateAmount(-1000);
    }
}
