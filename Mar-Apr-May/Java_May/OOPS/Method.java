package OOPS;

class MethodExample {
    // integer return method
    int intMethod () {
        return 5;
    }

    // float return method
    float floatMethod () {
        return 6.5f;
    }

    // double return method
    double doubleMethod () {
        return 65.3;
    }

    // string return method
    String stringMethod () {
        return "abc";
    }

    // character return method
    char charMethod (char ch) {
        return ch;
    }

    // no return type method
    void noReturnMethod (String str) {
        System.out.println("Hii " + str);
    }
}

public class Method {
    public static void main(String[] args) {
        // object creation for MethodExample class
        MethodExample obj1 = new MethodExample();

        // int res = obj1.intMethod();
        // char res = obj1.charMethod('a');
        // System.out.println(res);

        obj1.noReturnMethod("Datapro");
    }
}
