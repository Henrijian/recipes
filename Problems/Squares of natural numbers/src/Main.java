import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long squareN = (long) Math.floor(Math.sqrt(N));
        for (long i = 1; i <= squareN; i++) {
            long square = i * i;
            System.out.println(square);
        }
    }
}