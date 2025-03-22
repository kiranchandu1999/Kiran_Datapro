// final class
final class FinalClass {
    // variables

    // methods
}

class ABC {
    // final variable
    // should initialize and cannot re update
    final int number1 = 10;

    // methods final
    final void m1() {

    }
}

class BCD extends ABC {
    // cannot override final methods
    // void m1() {

    // }
}

public class FinalExample {
    public static void main(String[] args) {
        
    }
}
