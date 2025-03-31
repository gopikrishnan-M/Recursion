package Recursion.Subseq;
// the pattern of taking some elements and leaving some elements from begining is known as subset
public class RemoveFilter {
    public static void main(String[] args) {
        String s="sapple";
        System.out.println(filterSubstringButNot(s));
    }

    private static String filter1(String s, int i) {
        String ans="";
        if(i== s.length()) return ans;
        if(s.charAt(i)!='a'){
            ans+=s.charAt(i);
        }
        return ans.concat(filter1(s,i+1));
    }

    public static String filter2(String s){
        String ans="";
        if(s.isEmpty()) return ans;
        if(s.charAt(0)!='a') ans+=s.charAt(0);
        return ans.concat(filter2(s.substring(1)));
    }

    public static void filter3(String s, String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c=s.charAt(0);
        if(c!='a') filter3(s.substring(1),ans+c);
        else filter3(s.substring(1),ans);
    }

    public static String filterSubstring(String s){
        if(s.isEmpty()) return "";
        if(s.startsWith("apple")) return filterSubstring(s.substring(5));
        else return s.charAt(0)+filterSubstring(s.substring(1));
    }

    //skip apple but not app
    public static String filterSubstringButNot(String s){
        if(s.isEmpty()) return "";
        if(!s.startsWith("apple") && s.startsWith("app")) return filterSubstringButNot(s.substring(3));
        else return s.charAt(0)+filterSubstringButNot(s.substring(1));
    }
}
