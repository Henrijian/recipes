import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int speed = scanner.nextInt();
        int fall = scanner.nextInt();
        int position = 0;
        for (int days = 1; true; days++) {
            position += speed;
            if (position >= height) {
                System.out.println(days);
                break;
            }
            position -= fall;
        }
    }
}