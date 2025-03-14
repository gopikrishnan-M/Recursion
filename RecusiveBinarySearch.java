package Recursion;
public class RecusiveBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,8,9};
        int target=9;
        int start=0;
        int end=arr.length-1;
        int index=bSearch(arr,target,start,end);
        System.out.println(index);
    }
    private static int bSearch(int[] arr, int target,int start, int end) {
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            start=mid+1;
        }
        else {
            end=mid-1;
        }
        return bSearch(arr,target,start,end);

    }
}
