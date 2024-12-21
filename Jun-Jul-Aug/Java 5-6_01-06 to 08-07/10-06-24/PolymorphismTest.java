class Calc {
    int add(int a, int b){
        return a+b;
    }

    float add(int a, float b){
        return a + b;
    }

    // long add(int a, int b){
    //     return a + b;
    // }
}

public class PolymorphismTest {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add(5, 3.5F);
    }
}
