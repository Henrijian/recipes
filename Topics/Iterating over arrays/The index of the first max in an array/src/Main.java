import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}