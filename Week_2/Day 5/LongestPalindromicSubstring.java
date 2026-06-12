public class LongestPalindromicSubstring {
    public static boolean isPalindrome(String subs){
        int n=subs.length();
        for(int i=0;i<n/2;i++){
            if(subs.charAt(i)!=(subs.charAt(n-i-1)))
            return false;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            String subs=s.substring(i,j+1);
            if(isPalindrome(subs) && subs.length()>ans.length())
               ans=subs;
        }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="babad";
        String ans=longestPalindrome(s);
        System.out.println("Longest palindrome Substring :"+ans);
    }
}
