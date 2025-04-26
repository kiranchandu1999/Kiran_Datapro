// e commerce app
class User {
    String userName;
    String emailId;

    User(String userName, String emailId) {
        this.userName = userName;
        this.emailId = emailId;
        System.out.println("user object created");
    }

    void login() {
        System.out.println(userName + " logged in with " + emailId);
    }
}

class Customer extends User {
    String shippingAddress;

    Customer(String userName, String emailId, String shippingAddress) {
        super(userName, emailId);
        this.shippingAddress = shippingAddress;
        System.out.println("customer object created");
    }

    void placeOrder(String product) {
        System.out.println(userName + "'s order placed for " + product);
    }
}

class PremiumCustomer extends Customer {
    int discountCoins;

    PremiumCustomer(String userName, String emailId, String shippingAddress, int discountCoins) {
        super(userName, emailId, shippingAddress);
        this.discountCoins = discountCoins;
        System.out.println("premium customer object created");
    }

    void getDiscount(int amount) {
        int finalAmount = amount - discountCoins;
        System.out.println("Amount to be paid " + finalAmount + ", item dispatched to " + shippingAddress);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        PremiumCustomer cus1 = new PremiumCustomer(
            "punitha", "punitha@gmail.com", "vskp", 50);

        System.out.println("--------");

        cus1.login();
        cus1.placeOrder("Laptop");
        cus1.getDiscount(10000);
    }
}
