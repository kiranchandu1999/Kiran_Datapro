public class NestedIfStatement {
    public static void main(String[] args) {
        int temperature = 35;
        boolean isRaining = true;

        if(temperature >= 27) {
            if(isRaining) {
                System.out.println("Bring umbrella..");
            }
            else {
                System.out.println("Wear sunglasses..");
            }
        }
        else {
            if(!isRaining) {
                System.out.println("Wear Sweater..");
            }
            else {
                System.out.println("Wear Rain coat..");
            }
        }
    }
}
