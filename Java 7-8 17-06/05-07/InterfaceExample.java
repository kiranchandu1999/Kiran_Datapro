interface Facebook {
    // variables by default public static final
    int a = 10;
    // methods by default public and abstract
    void login();
}

class FacebookImpl implements Facebook {
    public void login() {
        System.out.println("Login successfull");
    }
}

class InterfaceExample {
    public static void main(String[] args) {
        Facebook fb1 = new FacebookImpl();
        fb1.login();
    }
}