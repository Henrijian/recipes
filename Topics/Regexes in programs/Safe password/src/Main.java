import java.util.*;

public class Main {
    public static boolean isStringPassword(String password) {
        if (password == null) {
            return false;
        }
        String lowerCaseRegex = ".*[a-z]+.*";
        String upperCaseRegex = ".*[A-Z]+.*";
        String digitRegex = ".*\\d+.*";
        int minLen = 12;
        return password.matches(lowerCaseRegex) && password.matches(upperCaseRegex)
                && password.matches(digitRegex) && password.length() >= minLen;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) {
            System.out.println("NO");
            return;
        }
        String password = scanner.nextLine().trim();
        System.out.println(isStringPassword(password) ? "YES" : "NO");
    }
}