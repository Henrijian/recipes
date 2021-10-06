import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int prev = 0;
        int diff = 0;
        int count = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (count == 0) {
                prev = num;
            } else {
                int curDiff = num - prev;
                if (curDiff * diff < 0) {
                    System.out.println(false);
                    return;
                }
                prev = num;
                diff = curDiff;
            }
            count++;
        }
        System.out.println(true);
    }
}