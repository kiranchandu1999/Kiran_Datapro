package control_loops;
public class ControlStatement {
    public static void main(String[] args) {
        int age = 13;

        // if(age >= 18){
        //     System.out.println("You are eligible for voting");
        // }
        // else{
        //     System.out.println("You are not eligible for voting");
        // }

        // ternary operator
        // String op = (age >= 18) ?  "You are eligible for voting" : "You are not eligible for voting";
        // System.out.println(op);

        // for school admissions
        // if(age <= 15){
        //     if(age < 5){
        //         System.out.println("kid");
        //     }
        //     else{
        //         System.out.println("admission");
        //     }
        // }
        // else{
        //     System.out.println("No admission");
        // }

        // ssc marks
        // >= 90 -> A
        // >= 80 -> B
        // >= 70 -> C
        // < 70 -> F
        // int marks = 65;
        
        // if(marks >= 90){
        //     System.out.println("A");
        // }
        // else if (marks >= 80){
        //     System.out.println("B");
        // }
        // else if (marks >= 70){
        //     System.out.println("C");
        // }
        // else{
        //     System.out.println("F");
        // }

        int a = 11, b = 5, c = 13;
        
        if(a > b){
            if(a > c){
                System.out.println("A is bigger");
            }
            else{
                System.out.println("C is bigger");
            }
        }
        else {
            if(b > c){
                System.out.println("B is bigger");
            }
            else{
                System.out.println("C is bigger");
            }
        }
    }
}
