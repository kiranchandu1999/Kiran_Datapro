class NestedIfElse {
    public static void main(String[] args) {
        // nested if else statement
        int temprature = 34;
        boolean isRaining = false;

        if(temprature > 30) {
            if(isRaining) {
                System.out.println("Hot and raining, bring Umbrella..");
            }
            else {
                System.out.println("Hot and no rain, wear sunglasses..");
            }
        }
        else {
            if(isRaining) {
                System.out.println("Cool and raining, wear Raincoat..");
            }
            else {
                System.out.println("Cool and no rain, wear sweater..");
            }
        }
    }
}