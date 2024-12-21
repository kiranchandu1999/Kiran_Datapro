public class ExceptionTest {
    public static void main(String[] args) {
        // code might throw exception
        try {
            int a = Integer.parseInt(args[1]); // "10"  --> 10
        }
        catch(Exception) {

        }

        // exception handling can done by try and catch blocks


        System.out.println(a);
        System.out.println("Program end..");
    }
}
