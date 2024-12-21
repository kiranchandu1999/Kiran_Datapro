class Car {
    // variables
    int number;
    String brand;
    String color;

    // is it prime number
    boolean isItPrime(int num){
        // logic
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    int add(int a, int b){
        return a + b;
    }

    void method1() {
        System.out.println("printing...");
    }
}

public class CarExample {
    public static void main(String[] args) {
        // object creation
        Car car1 = new Car();
        car1.number = 101;
        car1.brand = "Suzuki";
        car1.color = "black";

        Car car2 = new Car();
        car2.number = 205;
        car2.brand = "Tata";
        car2.color = "white";

        car2.isItPrime(21);

        car2.method1();

        System.out.println();
    }
}