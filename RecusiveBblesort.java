package Recursion;

import java.util.Arrays;

public class RecusiveBblesort {
    public static void main(String[] args) {
        int [] arr={10,7,5,9,7,3,2};
        bbleSort(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] bbleSort(int[] arr,int i,int j) {
        if(i>arr.length-1) return arr;
        if(j<arr.length-1 ) {
            if(arr[j]>arr[j +1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
             return bbleSort(arr, i, j + 1);
        }
        return bbleSort(arr,i+1,0);
    }
}
