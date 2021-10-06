import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int lo = scanner.nextInt();
        int hi = scanner.nextInt();
        int divisor = scanner.nextInt();
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}