public class MultiDimensionalArray{
    public static void main(String[] args) {
        // 2D array declaration
        // int[][] arr1 = new int[3][4];

        int[][] arr1 = {{4, 5, 8, 6}, {1, 3, 7, 2}, {9, 4, 5, 1}};

        System.out.println(arr1[1][2]);

        // int[] arr2 = {5, 6, 8};

        // for(int a : arr2){
        //     System.out.println(a);
        // }

        // for(int[] a : arr1){
        //     for(int b : a){
        //         System.out.print(b + " ");
        //     }
        //     System.out.println();
        // }

        for(int i=0; i<=arr1.length-1; i++){
            int[] a = arr1[i];
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}