import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            try {
                int num = Integer.parseInt(str);
                if (num == 0) {
                    break;
                }
                System.out.println(num * 10);
            } catch (NumberFormatException e) {
                System.out.println(String.format("Invalid user input: %s", str));
            }
        }
    }
}