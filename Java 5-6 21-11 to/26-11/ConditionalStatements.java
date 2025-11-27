public class ConditionalStatements {
    public static void main(String[] args) {
        // Nested if else
        int age = 19;
        boolean license = false;
        boolean ownCar = true;

        if(age >= 18) {
            if(license) {
                if(ownCar) {
                    System.out.println("You can drive your own car..");
                }
                else {
                    System.out.println("You can drive but you don't have own car!!");
                }
            }
            else {
                System.out.println("You cannot drive!!");
            }
        }
        else {
            System.out.println("You're a child...");
        }

        // Switch case
        int day = 2;

        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Not a week day!!");
        }
    }
}
