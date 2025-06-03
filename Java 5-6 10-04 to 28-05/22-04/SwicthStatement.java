public class SwicthStatement {
    public static void main(String[] args) {
        int monthDays = 27;

        switch(monthDays) {
            case 30:
                System.out.println("30 days months...");
                break;
            case 31:
                System.out.println("31 days months..");
                break;
            case 28:
                System.out.println("28 days month..");
                break;
            default:
                System.out.println("Not a valid month..");
        }
    }
}
