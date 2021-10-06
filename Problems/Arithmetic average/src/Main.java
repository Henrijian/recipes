import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int lo = scanner.nextInt();
        int hi = scanner.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println(sum / count);
    }
}