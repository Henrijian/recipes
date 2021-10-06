import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        boolean hitEachOther = (x1 == x2) || (y1 == y2) || (Math.abs(x1 - x2) == Math.abs(y1 - y2));
        if (hitEachOther) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}