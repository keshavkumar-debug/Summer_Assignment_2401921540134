public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
        return i==s.length();
    }
    public static void main(String[] args) {
        String s ="acb",t ="ahbgdc";
        if(isSubsequence(s, t))
            System.out.println("String '"+s+"' is a subsequence of String '"+t+"'.");
        else System.out.println("String '"+s+"' is not subsequence of String '"+t+"'.");
    }
}
