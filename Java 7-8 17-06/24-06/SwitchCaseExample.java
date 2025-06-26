public class SwitchCaseExample {
    public static void main(String[] args) {
        // switch case
        // switch(expression/variable) {
        //     case val1:
        //         // statement
        //     case val2:
        //         // statement
        // }

        int dayCount = 40;

        switch (dayCount) {
            case 28:
                System.out.println("Feb");
                break;
            case 30:
                System.out.println("April, June, Sep, Nov");
                break;
            case 31:
                System.out.println("Jan, Mar, May, Jul, Aug, Oct, Dec");
                break;
            default:
                System.out.println("Not a valid month..");
        }

    }
}
