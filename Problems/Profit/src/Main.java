import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextInt();
        int percent = scanner.nextInt();
        double target = scanner.nextInt();
        int year = 0;
        while (money < target) {
            year++;
            money *= 1 + percent / 100.0;
        }
        System.out.println(year);
    }
}