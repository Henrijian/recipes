import java.util.*;

public class Main {
    public static boolean isValidIP(String ip) {
        if (ip == null) {
            return false;
        }
        String numRegex = "(\\d|[1-9]\\d||1\\d{2}|2[0-4]\\d|25[0-5])";
        String ipRegex = String.format("%s\\.%s\\.%s\\.%s", numRegex, numRegex, numRegex, numRegex);
        return ip.matches(ipRegex);
    }
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) {
            return;
        }
        String ip = scanner.nextLine().trim();
        System.out.println(isValidIP(ip) ? "YES" : "NO");
    }
}