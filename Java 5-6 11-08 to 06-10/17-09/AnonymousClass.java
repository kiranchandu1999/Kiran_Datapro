interface Facebook {
    void login();

    void printLogo();
}

// class FacebookImpl extends Facebook {
//     @Override
//     void login() {
//         System.out.println("login successful!");
//     }

//     void printLogo() {
//         System.out.println("This is Facebook..");
//     }
// }

public class AnonymousClass {
    public static void main(String[] args) {
        // Facebook fb1 = new Facebook();
        Facebook fb2 = new Facebook() {
            @Override
            public void login() {
                System.out.println("login successful!");
            }

            public void printLogo() {
                System.out.println("This is Facebook..");
            }
        };

        fb2.login();
        fb2.printLogo();
    }
}
