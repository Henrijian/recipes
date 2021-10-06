import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Integer prev = null;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int curr = scanner.nextInt();
            if (prev != null) {
                int product = prev * curr;
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
            prev = curr;
        }
        System.out.println(maxProduct);
    }
}