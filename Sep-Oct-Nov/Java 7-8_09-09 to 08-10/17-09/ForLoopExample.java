public class ForLoopExample {
    public static void main(String[] args) {
        // for loop
        // print datapro 10 times
        for(int i=1; i <= 10; i++){
            System.out.println("datapro");
        }

        int i = 1;
        while(i <= 10){
            System.out.println(i);
            // updation
            i++;
        }

        // do while loop
        int j = 1;
        do{
            System.out.println("datapro");
            j++;
        } while(j <= 5);
    }
}