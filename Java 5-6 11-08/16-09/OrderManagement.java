class Order {
    String orderId;
    String customerName;

    Order(String oId, String cName) {
        orderId = oId;
        customerName = cName;
    }

    // non static nested class (inner class)
    class Item {
        String itemName;
        int qty;

        Item(String iName, int q) {
            itemName = iName;
            qty = q;
        }

        void printOrderDetails() {
            System.out.println("Order id: " + orderId + ", Item: " + itemName + ", qty: " + qty);
        }
    }

    void printCustomerName() {
        System.out.println("Customer: " + this.customerName);
    }

    // static nested class
    static class Utility {
        void printDefaultDeliveryAddress() {
            System.out.println("Default delivery address: VSKP");
        }
    }
}

class OrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order("OD101", "John");
        Order.Item i1 = o1.new Item("Iphone 15", 1);
        o1.printCustomerName();
        i1.printOrderDetails();

        Order.Utility u1 = new Order.Utility();
        u1.printDefaultDeliveryAddress();
    }
}