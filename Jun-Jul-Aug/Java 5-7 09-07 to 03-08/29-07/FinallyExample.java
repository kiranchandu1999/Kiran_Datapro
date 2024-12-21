import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int num = Integer.parseInt(sc.next());
            System.out.println(num);
        }
        // catch(NumberFormatException ne){
        //     System.out.println(ne);
        // }
        finally{
            sc.close();
            System.out.println("scanner closed");
        }

        System.out.println("program end");
    }
}
