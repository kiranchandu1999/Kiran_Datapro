public class IfElseIfExample {
    public static void main(String[] args) {
        int day = 3;

        // if(day == 1) {
        //     System.out.println("Sunday");
        // }
        // else if(day == 2){
        //     System.out.println("Monday");
        // }
        // else if(day == 3){
        //     System.out.println("Tuesday");
        // }
        // else {
        //     System.out.println("No week day");
        // }

        switch(day) {
            case 1:
               System.out.println("Sunday");
               System.out.println("Hii");
               break;
            case 2:
               System.out.println("Monday");
               break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("No week day");
        }
    }
}
