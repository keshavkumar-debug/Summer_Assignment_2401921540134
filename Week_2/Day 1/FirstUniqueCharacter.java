import java.util.HashMap;
public class FirstUniqueCharacter {
   public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1) return i;
        }
        return -1;
    } 
    public static void main(String[] args) {
        // String s="leetcode";
        String s="loveleetcode";
        int ans=firstUniqChar(s);
        System.out.println("First Unique Character in given string is At index: "+ ans);
    }
}
