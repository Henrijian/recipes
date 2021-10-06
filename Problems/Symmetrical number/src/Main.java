import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int n = number.length();
        for (int i = 0; i <= n / 2; i++) {
            if (number.charAt(i) != number.charAt(n - 1 - i)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(1);
    }
}