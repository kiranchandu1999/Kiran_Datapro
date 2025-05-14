class FindMaximum {
    public static void main (String[]args) {
        int a = 16;
        int b = 30;
        int c = 21;
        if(a>b) {
            if(a>c) {
                System.out.println("A is maximum");
            }
            else {
                System.out.println("c is maximum");
            } 
        } 
        else {
            if(b>c) {
                System.out.println("b is maximum");
            } 
            else {
                System.out.println("c is maximum");
            }
        }
    }
}