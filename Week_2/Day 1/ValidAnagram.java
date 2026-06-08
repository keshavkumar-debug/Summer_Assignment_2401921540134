import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        
        for(char ch:t.toCharArray()) {
            if(!map.containsKey(ch) || map.get(ch)==0) return false;
            else map.put(ch,map.get(ch)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram",t="nagaram";
        if(isAnagram(s, t)) System.out.println("String t is an anagram of String s");
        else System.out.println("String t is not anagram of String s");
    }
}
