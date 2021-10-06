import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
        long subtractHours = scanner.nextLong();
        long addMinutes = scanner.nextLong();
        dateTime = dateTime.minusHours(subtractHours);
        dateTime = dateTime.plusMinutes(addMinutes);
        System.out.println(dateTime);
    }
}