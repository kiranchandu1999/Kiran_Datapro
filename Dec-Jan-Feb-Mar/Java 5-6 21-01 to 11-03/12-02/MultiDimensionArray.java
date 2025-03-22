class MultiDimensionArray {
    public static void main(String[] args) {
        // 2D array
        int[][] arr1 = new int[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[1][0] = 3;
        arr1[1][1] = 4;
        arr1[2][0] = 5;
        arr1[2][1] = 6;

        // System.out.println(arr1[0][0]);
        // System.out.println(arr1[0][1]);
        // System.out.println(arr1[1][0]);
        // System.out.println(arr1[1][1]);
        // System.out.println(arr1[2][0]);
        // System.out.println(arr1[2][1]);

        for(int i=0; i<=2; i++) {
            for(int j=0; j<=1; j++){
                System.out.println(arr1[i][j]);
            }
        }

    }
}