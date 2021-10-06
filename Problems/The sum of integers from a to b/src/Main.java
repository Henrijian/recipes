import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int lo = Integer.parseInt(scanner.nextLine());
        int hi = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = lo; i <= hi; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}