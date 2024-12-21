package Misc;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionalStreams {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int[] even = new int[5];
        int[] newArr = new int[10];
        // int j= 0;

        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] % 2 == 0){
        //         even[j] = arr[i];
        //         j++;
        //     }
        // }

        // filteration
        even = Arrays.stream(arr).filter((e) -> e%2 == 0).toArray();

        // mapping
        newArr = Arrays.stream(arr).map((e) -> e + 2).toArray();

        // for each
        Arrays.stream(arr).map((e) -> e + 2).forEach((e) -> System.out.println(e));

        // for(int i=0; i<even.length; i++){
        //     System.out.println(even[i]);
        // }

        // for(int i=0; i<newArr.length; i++){
        //     System.out.println(newArr[i]);
        // }
    }
}
