import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = 0;
        int num = 1;
        while (size < n) {
            for (int i = 0; i < num; i++) {
                System.out.print(String.format("%d ", num));
                size++;
                if (size == n) {
                    break;
                }
            }
            num++;
        }
    }
}