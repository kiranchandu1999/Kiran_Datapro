public class MultiDimensionalArray{
    public static void main(String[] args) {
        // 2D array
        // int[][] arr1 = new int[3][4];

        int[][] arr1 = {{4, 5, 8, 6}, {1, 3, 7, 2}, {9, 4, 5, 1}};

        // to read the data
        for(int i=0; i<=arr1.length-1; i++){
            for(int j=0; j<=arr1[0].length-1; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(arr1[0][2]);
    }
}