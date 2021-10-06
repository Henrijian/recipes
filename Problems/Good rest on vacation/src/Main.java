import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodCost = scanner.nextInt(); // per day
        int flightCost = scanner.nextInt(); // one way
        int hotelCost = scanner.nextInt(); // per day
        int sum = days * foodCost + flightCost * 2 + (days - 1) * hotelCost;
        System.out.println(sum);
    }
}