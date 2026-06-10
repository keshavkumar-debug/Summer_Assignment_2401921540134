public class RepeatedSubstringPattern {
     public static boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        str=str.substring(1,str.length()-1);
        return str.contains(s);
    }
    public static void main(String[] args) {
        String s = "aba";
        if(repeatedSubstringPattern(s))
            System.out.println("'"+s + "' has repeated substring pattern.");
        else   
            System.out.println("'"+s + "' has not repeated substring pattern.");
    }
}
