interface Counter{
    // abstract methods
    void increment();
    void decrement();
    int getValue();

    // default method
    default int getNumber(){
        return 1;
    }

    static void print(){
        System.out.println("Datapro");
    }
}

class OneCounter implements Counter{
    int value = 0;
    public void increment(){
        value = value + getNumber();
    }

    public void decrement(){
        value = value - getNumber();
    }

    public int getValue(){
        return value;
    }
}

class TenCounter implements Counter{
    int value = 0;
    public void increment(){
        value = value + getNumber();
    }

    public void decrement(){
        value = value - getNumber();
    }

    public int getValue(){
        return value;
    }

    public int getNumber(){
        return 10;
    }
}

public class InterfaceDefaultAndStatic {
    public static void main(String[] args) {
        Counter c1 = new OneCounter();
        c1.increment();  
        System.out.println(c1.getValue()); 
        // System.out.println(c1.getNumber());

        Counter c2 = new TenCounter();
        c2.increment();
        c2.increment();
        System.out.println(c2.getValue());
        System.out.println(c2.getNumber());

        Counter.print();
    }
}
