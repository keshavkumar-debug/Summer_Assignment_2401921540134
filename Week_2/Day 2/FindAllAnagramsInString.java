import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        int a[]=new int[26];
        int b[]=new int[26];
        ArrayList<Integer> ans=new ArrayList<>();
         if (p.length() > s.length()) return ans;
        for(char ch:p.toCharArray()) a[ch-'a']++;
        for(int i=0;i<p.length();i++) b[s.charAt(i)-'a']++;
        int j=0;
        if(match(a,b)) ans.add(j);
        for(int i=p.length();i<s.length();i++){
            b[s.charAt(i)-'a']++;
            b[s.charAt(j++)-'a']--;
            if(match(a,b)) ans.add(j);
        }
        return ans;
    }
    public static boolean match(int a[],int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abab", p = "ab";
        ArrayList<Integer> ans=new ArrayList<>(findAnagrams(s, p));
        System.out.print("Starting indices of anagrams in given String p: ");
        System.out.println(ans);
    }
}
