class Methods {
    // types
    // int
    int add() {
        int res = 5 + 3;
        return res;
    }

    String getName() {
        String val = "dcwjhjhdwf";
        return val;
    }

    int a = 5;

    // no return type method
    void process () {
        a =  a + 2;
    }
}

class Calculator{
    // methods
    // addition
    int add(int a, int b){
        return a + b;
    }
}

public class MethodExample {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int res = c1.add(5, 6);

        Methods m1 = new Methods();
        int res2 = m1.add();
        
        System.out.println(res2);
    }
}
