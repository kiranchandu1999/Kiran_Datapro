import java.util.ArrayList;

class Cart {
    ArrayList<String> items = new ArrayList<String>();

    // adding items to arraylist
    void addItem(String item) {
        this.items.add(item);
    }

    // removing items from arraylist
    void removeItem(String item) {
        if(items.remove(item)) {
            System.out.println("Item removed from cart: " + item);
        }
        else {
            System.out.println("Cart didn't contain this item: " + item);
        }
    }

    // show items in arraylist
    void showItems() {
        if(!items.isEmpty()) {
            System.out.println("Items in the cart: " + items);
        }
        else {
            System.out.println("No items in the cart..!");
        }
    }

    // clear arraylist
    void emptyCart() {
        this.items.clear();
    }

    // show last added item
    void lastItem() {
        System.out.println("Last added item: " + items.get(items.size()-1));
    }
}

class ShoppingCartDemo {
    public static void main(String[] args) {
        Cart c1 = new Cart();
        c1.addItem("Realme buds");
        c1.addItem("mobile");
        c1.addItem("dell laptop");
        c1.showItems();
        c1.removeItem("mobile");
        c1.showItems();
        c1.lastItem();
        c1.emptyCart();
        c1.showItems();
    }
}