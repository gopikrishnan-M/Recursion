package Recursion.LevelOne;

public class SortedCheck {
    public static void main(String[] args) {
        int[] arr={1,3,5,9,2};
        System.out.println(sortd(arr,0));
    }
    private static boolean sortdOrWut(int[] arr, int i) {
        if(i==arr.length-1) return true;
        if(arr[i]<arr[i+1]){
            return sortdOrWut(arr,++i);
        }
        else return false;
    }
    public static boolean sortd(int[] arr,int i){
        if(i==arr.length-1) return true;
        return arr[i]< arr[i+1] && sortd(arr,i+1);
    }
}
