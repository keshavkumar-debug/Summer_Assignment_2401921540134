public class IndexOfFirstOccurenceInTheString {
    public static int strStr(String haystack, String needle) {
        int k=haystack.length()-needle.length();
        if(k<0) return -1;
        int len=needle.length();
        for(int i=0;i<=k;i++){
            if(haystack.substring(i,i+len).equals(needle)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack="psadbutsad", needle = "sad";
        int ans=strStr(haystack, needle);
        System.out.println("The index of the first Occurence of needle in haystack is : " + ans);
    }
}
