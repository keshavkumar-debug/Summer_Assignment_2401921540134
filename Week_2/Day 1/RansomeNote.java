import java.util.HashMap;
public class RansomeNote {
    public static boolean canConstruct(String r, String s) {
        if(r.length()>s.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        for(char ch:r.toCharArray()) {
            if(!map.containsKey(ch) || map.get(ch)==0) return false;
            else map.put(ch,map.get(ch)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "ab";
        if(canConstruct(ransomNote, magazine))
            System.out.println("ransomNote can be constructed by using the letters from magazine");
        else 
            System.out.println("ransomNote can not be constructed by using the letters from magazine");
    }
}
