import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        boolean isTriangle = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
        if (isTriangle) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}