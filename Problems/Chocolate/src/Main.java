import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int target = scanner.nextInt();
        if (target <= height * width && (target % height == 0 || target % width == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}