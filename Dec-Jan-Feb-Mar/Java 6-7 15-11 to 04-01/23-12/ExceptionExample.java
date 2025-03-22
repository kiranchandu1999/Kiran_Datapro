public class ExceptionExample {
    public static void main(String[] args) {
        int a = 0;
        try{
            System.out.println("try start");
            a = Integer.parseInt(args[0]); // "10"  ---> 10
            a = a / 0;
            System.out.println("try end");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch(NumberFormatException e) {
            e.printStackTrace();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(a);

        System.out.println("program end...");
    }
}