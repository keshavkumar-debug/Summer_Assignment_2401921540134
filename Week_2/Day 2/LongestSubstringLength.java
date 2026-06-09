import java.util.HashSet;

public class LongestSubstringLength {
    public static int lengthOfLongestSubstring(String s) {
        int ans=0,left=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left++));
            }
            set.add(ch);
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="pwwkew";
        int ans=lengthOfLongestSubstring(s);
        System.out.println("Length of Longest Substring without repeating characters is :" + ans);
    }
}
