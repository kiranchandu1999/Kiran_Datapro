public class NestedSwitchStatement {
    public static void main(String[] args) {
        int year = 2;
        String branch = "ECE";

        switch(year) {
            case 1:
                switch(branch) {
                    case "ECE":
                        System.out.println("1st year ECE, subjects: English, Maths");
                        break;
                    case "CSE":
                        System.out.println("1st year CSE, subjects: Physics, Maths");
                }
                break;
            case 2:
                switch(branch) {
                    case "ECE":
                        System.out.println("2nd year ECE, subjects: SS, Java");
                        break;
                    case "CSE":
                        System.out.println("2nd year CSE, subjects: DLD, COA");
                }
        }
    }
}
