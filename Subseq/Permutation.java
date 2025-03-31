package Recursion.Subseq;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String s="abcd";
        permute("",s);
        System.out.println(permuteCount("",s));
    }

    private static void permute(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char alter = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permute(f + alter + s,up.substring(1));
        }
    }

    private static ArrayList<String> permutedList(String p, String up) {
        ArrayList<String> ans= new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        char alter = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutedList(f + alter + s,up.substring(1)));
        }
        return ans;
    }

    private static int permuteCount(String p, String up) { //we can simply apply formula of n factorial but improve the thought process
        if (up.isEmpty()) return 1;
        int count=0;
        char alter = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count+=permuteCount(f + alter + s,up.substring(1));
        }
        return count;
    }
}
