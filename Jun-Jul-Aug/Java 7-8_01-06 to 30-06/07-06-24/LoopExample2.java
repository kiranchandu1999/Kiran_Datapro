public class LoopExample2 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }

        // for(int i=6; i<=10; i++){
        //     System.out.println(i);
        // }
    }
}
