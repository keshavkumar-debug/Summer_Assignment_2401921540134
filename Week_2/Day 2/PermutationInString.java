public class PermutationInString {
    
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
       int s[]=new int[26]; 
       int t[]=new int[26];
       for(char ch:s1.toCharArray()) s[ch-'a']++;
       int k=s1.length();
       for(int i=0;i<k;i++) t[s2.charAt(i)-'a']++; 
       if (match(s,t)) return true;
       for(int i=k;i<s2.length();i++){
        t[s2.charAt(i)-'a']++;
        t[s2.charAt(i-k)-'a']--;
        if(match(s,t)) return true;
       }
       return false;
    }
    public static boolean match(int s[],int t[]){
        for(int i=0;i<26;i++){
            if(s[i]!=t[i]) return false;
        }
        return true;
    }
     public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean ans = checkInclusion(s1, s2);

        System.out.println(ans);
    }
}
