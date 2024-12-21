package control_loops;

public class BreakContinue {
    public static void main(String[] args) {
        // break in while loop
        int i = 11;
        // while(i <= 20){
        //     System.out.println(i);
        
        //     if(i == 16){
        //         break;
        //     }
        //     i++;
        // }

        // continue in for loop
        // for(int j=1; j<=10; j++){
        //     if(j % 2 == 0){
        //         continue;
        //     }
        //     System.out.println(j);
        // }

        // continue in while loop
        while(i <= 20){
            i++;
            if(i % 2 != 0){
                continue;
            }

            System.out.println(i);
        }
    }
}
