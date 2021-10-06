import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int desk1 = (int) Math.ceil(scanner.nextInt() / 2.0);
        int desk2 = (int) Math.ceil(scanner.nextInt() / 2.0);
        int desk3 = (int) Math.ceil(scanner.nextInt() / 2.0);
        int deskAll = desk1 + desk2 + desk3;
        System.out.println(deskAll);
    }
}