import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int positiveCount = 0;
        if (scanner.nextInt() > 0) {
            positiveCount++;
        }
        if (scanner.nextInt() > 0) {
            positiveCount++;
        }
        if (scanner.nextInt() > 0) {
            positiveCount++;
        }
        System.out.println(positiveCount == 1);
    }
}