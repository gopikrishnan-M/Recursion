package Recursion.Subseq;

import java.util.ArrayList;

public class DiceAmazon {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceArray("",5));
    }
    private static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i ,target - i);
        }
    }

    private static ArrayList<String> diceArray(String p, int target) {
        ArrayList<String> ans=new ArrayList<>();
        if (target == 0) {
            ans.add(p);
            return ans;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceArray(p + i ,target - i));
        }
        return ans;
    }
}
