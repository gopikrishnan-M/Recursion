package Recursion.Subseq;

import java.util.ArrayList;
import java.util.HashMap;

public class Prob17 {
    public static void main(String[] args) {
        //System.out.println(permutedList("","something","123"));
        //permutedprint("","415683");
        // System.out.println(permutedArr("","234"));
        System.out.println(numpadKunal("","123"));
    }

    private static void permutedprint(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p+" , ");
            return;
        }
        char key = up.charAt(0);
        HashMap<Character,String> keypad=new HashMap<>();
        keypad= keyPadF(keypad);
        String alfa=keypad.get(key);
        for (int i = 0; i < alfa.length() ; i++) {
            permutedprint(p+ alfa.charAt(i),up.substring(1));
        }
    }

    private static ArrayList<String> permutedArr(String p, String up) {
        ArrayList<String> ans=new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        HashMap<Character,String> keypad=new HashMap<>();
        keypad= keyPadF(keypad);
        char key = up.charAt(0);
        String alfa=keypad.get(key);
        for (int i = 0; i < alfa.length() ; i++) {
            ans.addAll(permutedArr(p+ alfa.charAt(i),up.substring(1)));
        }
        return ans;
    }

    public static ArrayList<String> numpadKunal(String p,String up){
        ArrayList<String> ans=new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        int digit=up.charAt(0)-'0';
        for (int i= digit*3 -3 ; i < digit * 3 ; i++){
            char c= (char) ('a'+i);
            ans.addAll(numpadKunal(p+c,up.substring(1)));
        }
        return ans;
    }

    // method for keyboard mobiles
    public static HashMap<Character,String> keyPadF(HashMap<Character,String> keypad){
        keypad.put('1'," ");
        keypad.put('2',"abc");
        keypad.put('3',"def");
        keypad.put('4',"ghi");
        keypad.put('5',"jkl");
        keypad.put('6',"mno");
        keypad.put('7',"pqrs");
        keypad.put('8',"tuv");
        keypad.put('9',"wxyz");
        return keypad;
    }
}
