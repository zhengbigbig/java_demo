package demo4;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValidParentheses(" '(', ')'"));
        System.out.println(solution.isValidParentheses( "'{', '}'"));
        System.out.println(solution.isValidParentheses(" '[' and ']'"));
        System.out.println(solution.isValidParentheses(" ()[]{}"));
        System.out.println(solution.isValidParentheses(" ([)]"));

    }
}
