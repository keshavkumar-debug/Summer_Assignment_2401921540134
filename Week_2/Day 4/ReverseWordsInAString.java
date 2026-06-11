public class ReverseWordsInAString {
 public static String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(String st:words){
            String rev=new StringBuilder(st).reverse().toString();
            ans.append(rev);
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String ans=reverseWords(s);
        System.out.println("String produced by reversing words : "+ans);
    }    
}
