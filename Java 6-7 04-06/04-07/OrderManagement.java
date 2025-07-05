// outer class
class Order {
    String orderId;
    String customerName;

    Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    // inner class
    class Item {
        String itemName;
        int qty;

        Item(String itemName, int qty) {
            this.itemName = itemName;
            this.qty = qty;
        }

        void showItemDetails() {
            System.out.println("Item: " + itemName + ", Qty: " + qty);
        }
    }

    void showOrderId() {
        System.out.println("Order id is: " + orderId);
    }

    // static class
    static class Flipkart {
        void showLogistics() {
            System.out.println("Hi, this is flipkart logistics...");
        }
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order("OD101", "Rahul");
        o1.showOrderId();
        Order.Item item1 = o1.new Item("Iphone 16", 2);
        Order.Item item2 = o1.new Item("Lenovo thinkpad14", 3);
        item1.showItemDetails();

        Order.Flipkart flp = new Order.Flipkart();
        flp.showLogistics();
    }
}
