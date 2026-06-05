import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length-1;
        if(n==0) return strs[0];
        if(strs[0]==strs[n]) return strs[0];
        int x=Math.min(strs[0].length(),strs[n].length());
        int i=0;
        for(i=0;i<x;i++){
            if(strs[0].charAt(i)!=strs[n].charAt(i)) break;
        }
        return strs[0].substring(0,i);
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        String s=longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix in given array String is : "+s);
    }
}
