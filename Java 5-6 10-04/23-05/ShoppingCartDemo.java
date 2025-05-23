import java.util.ArrayList;

class Cart {
    ArrayList<String> cartItems = new ArrayList<String>();

    // method to add items to the cart
    void addItem(String product) {
        // add(object) method to add elements to ArrayList
        cartItems.add(product);
    }

    void removeItem(String product) {
        if(cartItems.contains(product)) {
            cartItems.remove(product);
        }
        else {
            System.out.println("product not exists...");
        }
    }

    void showCartItems() {
        if(cartItems.isEmpty()) {
            System.out.println("cart is empty..");
        }
        else {
            for(String i: cartItems) {
                System.out.println(i);
            }
        }
    }

    void clearCart() {
        cartItems.clear();
        System.out.println("Cart items cleared..");
    }

    void getItemAtGivenPosition(int pos) {
        if(pos >= 0 && pos < cartItems.size()) {
            System.out.println("Item at pos " + pos + ": " + cartItems.get(pos));
        }
        else {
            System.out.println("Given position invalid...");
        }
    }
}

class ShoppingCartDemo {
    public static void main(String[] args) {
        Cart c1 = new Cart();
        c1.addItem("Lenovo Thinkpad laptop");
        c1.addItem("Puma shoes");
        c1.addItem("Oppo A35 mobile");
        // show cart items
        // c1.showCartItems();
        c1.addItem("Nike sports shoes");
        c1.removeItem("Puma shoes");
        c1.showCartItems();
        c1.getItemAtGivenPosition(1);

        // clearng cart
        c1.clearCart();
        c1.showCartItems();
    }
}