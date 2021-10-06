import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int D = 0;
        int C = 0;
        int B = 0;
        int A = 0;
        for (;n > 0; n--) {
            int point = Integer.parseInt(scanner.nextLine());
            if (point == 5) {
                A++;
            } else if (point == 4) {
                B++;
            } else if (point == 3) {
                C++;
            } else if (point == 2) {
                D++;
            }
        }
        System.out.println(String.format("%d %d %d %d", D, C, B, A));
    }
}