package Recursion.LevelOne;

public class BsrchRotatedArr {
    public static void main(String[] args) {
        int[] arr={1,23,34,45,56,67};
        System.out.println(rtdsrch(arr,67,0,arr.length-1));
    }
    public static int rtdsrch(int[] arr, int target, int s, int e){
        if(s>e) return -1;
        int m=s+(e-s)/2;
        if(arr[m]==target) return m;
        /*
         * when we have to handle duplicate elements in  rotated arry
         * then add a condition if arr of s=m=e then skip them by s++ and e-- and call the function*/
        if(arr[m] >= arr[s]) {
            if (target <= arr[m] && target >= arr[s])
                return rtdsrch(arr, target, s, m - 1);
            else
                return rtdsrch(arr, target, m + 1, e);
        }
        if(arr[m]<=arr[e]){
            if(target>=arr[m] && target<= arr[e])
                return rtdsrch(arr,target,m+1,e);
            else
                return rtdsrch(arr,target,s,m-1);
        }
        return -1;
    }
}
