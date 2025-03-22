class ForEachLoopExample {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 20, 25, 30};

        // for(int i=0; i<arr1.length; i++) {
        //     System.out.println(arr1[i]);
        // }

        // for each loop
        for(int x: arr1) {
            System.out.println(x);
        }

        // int[][] arr2 = new int[3][2];
        int[][] arr2 = {{5, 10}, {20, 30}, {50, 60}};

        // for each loop
        for(int[] x: arr2) {
            for(int y: x) {
                System.out.println(y);
            }
        }
    }
}