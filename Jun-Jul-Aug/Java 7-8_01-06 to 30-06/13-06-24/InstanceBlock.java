class ABC{
    ABC(){
        System.out.println("ABC constructor");
    }

    // instance block
    {
        System.out.println("ABC instance block");
    }
}

class CDE extends ABC{
    CDE(){
        System.out.println("CDE constructor");
    }

    {
        System.out.println("CDE instance block");
    }
}

public class InstanceBlock {
    int a = 5;

    public static void main(String[] args) {
        // CDE c1 = new CDE();

        // InstanceBlock o1 = new InstanceBlock();

        // System.out.println(o1.a);
    }
}
