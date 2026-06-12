import java.util.*;

public class StringCompression {
    public static int compress(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder st = new StringBuilder();
        for (char key : map.keySet()) {
            st.append(key);
            int freq = map.get(key);
            if (freq > 1) {
                st.append(freq);
            }
        }
        for (int i = 0; i < st.length(); i++) {
            chars[i] = st.charAt(i);
        }
        return st.length();
    }
    public static void main(String[] args) {
        char ch[]={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int ans=compress(ch);
        System.out.println("Compressed String length will be : " + ans);
    }
}
