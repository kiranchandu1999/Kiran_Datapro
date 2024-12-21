public class ExceptionTest{
    public static void main(String[] args) { // ["50", "100", "150"]
        int num = 0;
        try{
            num = Integer.parseInt(args[0]); // "50"  --> 50

            int rem = num / 0;
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("please enter atleast one number"); // no value
        }
        catch(NumberFormatException ne){
            System.out.println("please enter valid number"); // string
        }
        catch(ArithmeticException are){
            System.out.println("number got divided by 0, so please look into it");
        }
        catch(RuntimeException re){

        }
        catch(Exception e){
            
        }

        if(num != 0){
            if(num % 2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
        else{
            System.out.println("no number");
        }
        
    }
}