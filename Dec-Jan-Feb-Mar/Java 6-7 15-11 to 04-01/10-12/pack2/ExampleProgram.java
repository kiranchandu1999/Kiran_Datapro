package pack2;

import pack1.ABC;

public class ExampleProgram extends ABC{
    public static void main(String[] args) {
        XYZ x1 = new XYZ();
        x1.display();
        x1.add();
    }
}

class XYZ extends ABC {
    int num3 = 5;
    void display() {
        ABC a1 = new ABC();
        // a1.num1; //private not accessible
        System.out.println(super.num3);
    }
}