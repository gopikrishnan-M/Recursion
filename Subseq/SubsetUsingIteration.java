package Recursion.Subseq;
import java.util.ArrayList;
import java.util.List;

public class SubsetUsingIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans=subset(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }
    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr){
            int n=outer.size();
            for (int i=0; i < n ; i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                if(!outer.contains(inner)) outer.add(inner); //overcomes even if duplicates are present
            }
        }
        return outer;
    }
}
