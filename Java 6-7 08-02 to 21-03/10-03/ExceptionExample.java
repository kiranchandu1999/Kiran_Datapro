public class ExceptionExample {
    public static void main(String[] args) {

        try {
            String input = args[0];

            int num = Integer.parseInt(input);

            int val = 100 / num;

            if(val % 2 == 0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        catch(NumberFormatException ne) {
            ne.printStackTrace();
            // System.out.println(ne.getMessage());
        }
        catch(ArithmeticException ae) {
            System.out.println(ae);
        }
        catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("Program end...");
    }
}
