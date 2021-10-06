import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
        dateTime = dateTime.plusHours(11);
        LocalDate date = dateTime.toLocalDate();
        System.out.println(date);
    }
}