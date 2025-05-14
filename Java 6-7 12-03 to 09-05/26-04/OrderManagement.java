class Order {
    String orderId;
    String customerName;

    Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    // non static
    // we can access outer class members as well
    class Item {
        String itemName;
        int qty;

        Item(String itemName, int qty) {
            this.itemName = itemName;
            this.qty = qty;
        }
    
        void printDetails() {
            System.out.println("Customer: " + customerName);
            System.out.println("Order id: " + orderId);
            System.out.println("Item name: " + itemName);
            System.out.println("Quantity: " + qty);
        }
    }

    // static class
    static class PaymentUtility {
        static void validateAmount(int amount) {
            if(amount > 0) {
                System.out.println("Valid amount: " + amount);
            }
            else {
                System.out.println("Not valid amount: " + amount);
            }
        }
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        // create order with an item
        Order order1 = new Order("od1563", "Rahul");

        Order.Item orderedItem = order1.new Item("Iphone 15", 2);

        orderedItem.printDetails();
        
        // if validateAmount method is static inside a static class
        // validate amount
        Order.PaymentUtility.validateAmount(500);
        Order.PaymentUtility.validateAmount(-1500);
        Order.PaymentUtility.validateAmount(2000);

        // if validateAmount method is non static inside a static class
        // Order.PaymentUtility util = new Order.PaymentUtility();
        // util.validateAmount(500);
        // util.validateAmount(-1500);
        
    }
}
