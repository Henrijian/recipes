import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
