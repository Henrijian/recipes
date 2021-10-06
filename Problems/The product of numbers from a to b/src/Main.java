import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int lo = scanner.nextInt();
        int hi = scanner.nextInt();
        long product = 1;
        for (int i = lo; i < hi; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}