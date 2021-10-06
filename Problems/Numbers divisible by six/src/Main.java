import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (;n > 0; n--) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 6 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}