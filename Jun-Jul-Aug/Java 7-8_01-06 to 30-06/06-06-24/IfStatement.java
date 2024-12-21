import java.util.Scanner;

class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // want to get input from user int type
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not eligible");
        }
        
    }
}