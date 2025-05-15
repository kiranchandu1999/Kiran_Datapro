class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // take input from user
            int num = Integer.parseInt(args[1]);

            // divide 100 with given number
            int res = 100 / num;

            System.out.println(res);

            String str = null;

            System.out.println(str.toUpperCase());
        }
        catch(NumberFormatException | NullPointerException ne) {
            System.out.println(ne.getMessage());
        }
        catch(ArithmeticException ae) {
            System.out.println(ae);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Excetuing remaining program...");

        System.out.println("program end...");
    }
}