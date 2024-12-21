class Calculator{
    int c, d;
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    int add(int a, double b){
        return 0;
    }
}

public class PolymorphismTest {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(15, 20);

        c1.add(15, 20, 5);
    }
}
