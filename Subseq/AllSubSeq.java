package Recursion.Subseq;

import java.util.ArrayList;

public class AllSubSeq {
    public static void main(String[] args) {
        String s="abc";
        //prntSeq("",s);
        System.out.println(retArrSeq("",s));

    }

    private static void prntSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
       char c=up.charAt(0);
        prntSeq(p+c,up.substring(1));
        prntSeq(p+(c+0),up.substring(1));//print the ascii vlue of the every character along with alfabet when "char"+0 is done
        prntSeq(p,up.substring(1));

    }

    private static ArrayList<String> retArrSeq(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
       char c=up.charAt(0);
        ArrayList<String> left=retArrSeq(p+c,up.substring(1));
        ArrayList<String> right=retArrSeq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
