package control_loops;
public class SwitchCase {
    public static void main(String[] args) {
        int gradePoint = 25;
        
        // if(gradePoint >= 90){
        //     System.out.println("A");
        // }
        // else if (gradePoint >= 80){
        //     System.out.println("B");
        // }
        // else if (gradePoint >= 70){
        //     System.out.println("C");
        // }
        // else{
        //     System.out.println("F");
        // }

        // switch case
        // switch (gradePoint) {
        //     case 10 :
        //         System.out.println("A");
        //         break;
        //     case 9 :
        //         System.out.println("B");
        //         break;
        //     case 8 :
        //         System.out.println("C");
        //         break;
        //     case 7 :
        //         System.out.println("D");
        //         break;
        //     default :
        //         System.out.println("E");
        // }


        char vowel = 'o';

        switch (vowel) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }

        if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
            System.out.println("vowel");           
        }
        else{
            System.out.println("not a vowel");
        }


        // nested switch case
        int collegeYear = 2;
        char branch = 'E';

        switch (collegeYear) {
            case 1:
                switch (branch) {
                    case 'E':
                        System.out.println("ECE");
                        break;
                    case 'C':
                        System.out.println("CN, OS, SD");
                        break;
                    default:
                        System.out.println("Others");
                }
                break;
            case 2:
                switch (branch) {
                    case 'E':
                        System.out.println("MPMC");
                        break;
                    case 'C':
                        System.out.println("DSA, Java, C");
                        break;
                    default:
                        System.out.println("Others");
                }
                break;
            case 3:
                switch (branch) {
                    case 'E':
                        System.out.println("EMTL");
                        break;
                    case 'C':
                        System.out.println("C++, Python");
                        break;
                    default:
                        System.out.println("Others");
                }
                break;
            default:
                System.out.println("final year");
        }

    }
}
