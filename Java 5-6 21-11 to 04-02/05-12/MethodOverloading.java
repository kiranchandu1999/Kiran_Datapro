class Calculator {
    int add(int n1, int n2) {
        System.out.printf("Adding two numbers: %d, %d\n", n1, n2);
        return n1 + n2;
    }

    // Method overloading is possible in 2 ways
    // changing no.of parameters
    int add(int n1, int n2, int n3) {
        System.out.printf("Adding two numbers: %d, %d, %d\n", n1, n2, n3);
        return n1+n2+n3;
    }

    // changing parameters data type
    double add(double n1, double n2) {
        return n1 + n2;
    }
}

// searching system of an app
class SearchSystem {
    // searching based on keyword
    void search(String keyword) {
        System.out.println("Searching for " + keyword);
    }

    // searching with keyword and price
    void search(String keyword, int price) {
        System.out.println("Searching for " + keyword + " under price: " + price);
    }

    // searching with keyword and category
    void search(String keyword, String category) {
        System.out.println("Searching for " + keyword + " in category: " + category);
    }
}


class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5, 3)); // 8
        System.out.println(c1.add(3, 6, 7)); // 16
        System.out.println(c1.add(5.6, 8.7)); // 14.3

        SearchSystem s1 = new SearchSystem();
        s1.search("mobile");
        s1.search("laptop", "dell");
        s1.search("television", 10000);
    }
}