import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int ship = 0;
        int fix = 0;
        int reject = 0;
        for (;n > 0; n--) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                ship++;
            } else if (num == 1) {
                fix++;
            } else if (num == -1) {
                reject++;
            }
        }
        System.out.println(String.format("%d %d %d", ship, fix, reject));
    }
}