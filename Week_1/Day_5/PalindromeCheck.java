class PalindromeCheck {
    public static boolean isPalindrome(String s) {
       StringBuilder d = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                d.append(Character.toLowerCase(ch));
            }
        }
        int i=0,j=d.length()-1;
        while(i<j){
            if(d.charAt(i)!=d.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        if(isPalindrome(s)) System.out.println("Given string is in palindrome");
        else  System.out.println("Given string is not a palindrome");
    }
}