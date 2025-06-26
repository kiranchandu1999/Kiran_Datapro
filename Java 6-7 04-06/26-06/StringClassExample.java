class StringClassExample {
    public static void main(String[] args) {
        // string objects
        // using string literal
        String userName1 = "user1";
        // using new keyword
        String obj1 = new String("user2");

        String obj2 = new String("user2");

        String userName2 = "user1";

        // validate email and password
        String email = " John@example.com  ";
        String password = "2545abc";

        // clearing extra spaces
        String clearedEmail = email.trim().toLowerCase();
        String clearedPwd = password.trim();

        // values stored in database
        String storedEmail = "john@example.com";
        String storedPassword = "2545abc";

        if(!clearedEmail.isEmpty() && !clearedPwd.isEmpty()) {
            if(clearedEmail.equals(storedEmail) && clearedPwd.equals(storedPassword)) {
                System.out.println("Logged in successfully!");
            }
            else {
                System.out.println("wrong credentials!!");
            }
        }
        else {
            System.out.println("Email or password cannot be empty!!");
        }
    }
}