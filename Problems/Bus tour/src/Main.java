import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridgesCount = scanner.nextInt();
        for (int i = 1; i <= bridgesCount; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println(String.format("Will crash on bridge %d", i));
                return;
            }
        }
        System.out.println("Will not crash");
    }
}