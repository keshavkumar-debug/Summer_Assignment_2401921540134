public class DecodeString {
     static int idx = 0;

    public static String decodeString(String s) {
        return helper(s);
    }
    public static String helper(String s) {
        String ans = "";
        while (idx < s.length() && s.charAt(idx) != ']') {
            char ch = s.charAt(idx);
            if (Character.isLetter(ch)) {
                ans += ch;
                idx++;
            }
            else {
                int num = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    num = num * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                idx++; 
                String decoded = helper(s);
                idx++; 
                for (int i = 0; i < num; i++) {
                    ans += decoded;
                }
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        String s="3[a2[c]]";
        String ans=decodeString(s);
        System.out.println("Decoded String of "+s+" is : "+ans);
    } 
}
