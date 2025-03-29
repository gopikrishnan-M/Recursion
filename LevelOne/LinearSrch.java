package Recursion.LevelOne;

import java.util.ArrayList;

public class LinearSrch {
    public static void main(String[] args) {
        int[] arr={3,2,5,6,7,8,9,7,1,10,7,3,2,5,7};
        System.out.println(findAll(arr,7,0,new ArrayList<>()));
        findWoArgs(arr,7,0);
    }

    private static ArrayList<Integer> findWoArgs(int[] arr, int target, int i) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(i==arr.length) return ans;
        if(arr[i]==target) ans.add(i);
        ans.addAll(findWoArgs(arr,target,++i));
        return ans;
    }

    private static ArrayList<Integer> findAll(int[] arr,int target,int i,ArrayList<Integer> ans){
        if(i==arr.length) return ans;
        if(arr[i]==target) ans.add(i);
        return findAll(arr,target,i+1,ans);
    }

    private static int findIndxLast(int[] arr, int target, int i) {
        if(i<0) return -1;
        if(arr[i]==target) return i;
        else return findIndxLast(arr,target,--i);
    }


    private static int findIndx(int[] arr, int target, int i) {
        if(i==arr.length) return -1;
        if(arr[i]==target) return i;
        else return findIndx(arr,target,i+1);
    }
}
