import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().trim().replace(" ", "");
        String s2 = scanner.nextLine().trim().replace(" ", "");
        System.out.println(s1.equals(s2));
    }
}