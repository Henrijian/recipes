import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        boolean ascending = true;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                prev = scanner.nextInt();
            } else {
                int curr = scanner.nextInt();
                if (curr < prev) {
                    ascending = false;
                    break;
                }
                prev = curr;
            }
        }
        System.out.println(ascending);
    }
}