import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cupNum = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        if (isWeekend) {
            System.out.println(cupNum >= 15 && cupNum <= 25);
        } else {
            System.out.println(cupNum >= 10 && cupNum <= 20);
        }
    }
}