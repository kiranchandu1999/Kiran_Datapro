package control_loops;
import OOPS.*;

public class ForLoop {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        // for loop
        for(i=1; i <= 3; i++) {
            sum = sum + i;
        }

        // Bank b1 = new Bank();
        // System.out.println(sum);


        // nested for loop
        // // outer loop
        // for(i=1; i<=5; i++){
        //     // inner loop
        //     for(int j=1; j <= 3; j++){
        //         System.out.println(j);
        //         if(j == 2){
        //             break;
        //         }
        //     }
        //     System.out.println();
        // }

        // labeled for loop
        // loop1:
        // for(i=1; i<=5; i++){
        //     // inner loop
        //     loop2:
        //     for(int j=1; j <= 3; j++){
        //         System.out.println(j);
        //         if(j == 2){
        //             break loop1;
        //         }
        //     }
        //     System.out.println();
        // }

        // patterns
        //  *
        //  * *
        //  * * *
        //  * * * *
        //  * * * * *

        // for(i=1; i <= 5; i++){
        //     for(int j=1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //       *       4 + 1   (n-i , (i*2-1))   1
        //      ***      3 + 3   (n-i,  (i*2-1))    2
        //     *****     2 + 5   (n-i,  (i*2-1))     3
        //    *******    1 + 7   (n-i,  (i*2-1))     4
        //   *********   0 + 9    (n-i,  (i*2-1))     5
        
        // int n = 5;
        // for(i=1; i<=n; i++){
        //     // spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for(int k=1; k<=(i*2-1); k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(i=n-1; i>=1; i--){
        //     // spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for(int k=1; k<=(i*2-1); k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // infinite loop (not recommended)
        // for(i=1; ; i++){
        //     System.out.println("Hi");
        // }
    }
}
