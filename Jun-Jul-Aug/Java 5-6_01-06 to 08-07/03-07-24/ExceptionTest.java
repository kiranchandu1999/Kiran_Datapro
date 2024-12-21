public class ExceptionTest{
    public static void main(String[] args) {
        int num = 0;
        try{
            num = Integer.parseInt(args[0]); 
        }
        catch(Exception e){
            System.out.println(e);
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