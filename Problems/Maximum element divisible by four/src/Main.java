import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = 0;
        for (;n > 0; n--) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 4 == 0 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}