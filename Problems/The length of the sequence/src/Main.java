import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            len++;
        }
        System.out.println(len);
    }
}