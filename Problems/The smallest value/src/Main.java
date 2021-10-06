import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long product = 1;
        for (long i = 1; i <= m; i++) {
            product *= i;
            if (product > m) {
                System.out.println(i);
                break;
            }
        }
    }
}