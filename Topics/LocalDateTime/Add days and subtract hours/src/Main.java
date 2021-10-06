import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.next());
        long addDays = scanner.nextLong();
        long subtractHours = scanner.nextLong();
        dateTime = dateTime.plusDays(addDays);
        dateTime = dateTime.minusHours(subtractHours);
        System.out.println(dateTime);
    }
}