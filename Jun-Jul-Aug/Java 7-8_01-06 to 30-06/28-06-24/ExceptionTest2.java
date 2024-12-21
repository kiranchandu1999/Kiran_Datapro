public class ExceptionTest2{
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt(args[0]);

            if(num % 2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
        catch(NumberFormatException ne){
            System.out.println(ne);
        }
        catch(RuntimeException re){
            
        }
        // unreachable catch block
        // catch(ArrayIndexOutOfBoundsException ae){
        //     System.out.println(ae);
        // }

        
        System.out.println("program ending...");

    }
}