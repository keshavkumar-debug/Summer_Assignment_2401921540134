import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generateparanthesis {
    public static void generate(int n, int l, int r, String par, List<String> ans) {
        if (r == n) {
            ans.add(par);
            return;
        }
        if (l < n)
            generate(n, l + 1, r, par + "(", ans);
        if (r < l)
            generate(n, l, r + 1, par + ")", ans);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        List<String> result = generateParenthesis(n);
        System.out.println("Valid Parentheses:");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
