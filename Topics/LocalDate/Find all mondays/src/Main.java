import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) {
            System.out.println("no year input");
            return;
        }
        LocalTime.MIDNIGHT
        int year = scanner.nextInt();
        if (!scanner.hasNext()) {
            System.out.println("no month input");
            return;
        }
        int month = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        for (int i = 0; i < date.lengthOfMonth(); i++) {
            LocalDate checkDate = date.plusDays(i);
            if (checkDate.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(checkDate);
            }
        }
    }
}