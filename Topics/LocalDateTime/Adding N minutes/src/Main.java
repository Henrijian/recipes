import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
        long addMinutes = scanner.nextInt();
        dateTime = dateTime.plusMinutes(addMinutes);
        if (dateTime.getSecond() == 0) {
            System.out.println(String.format("%d %d %02d:%02d", dateTime.getYear(),
                    dateTime.getDayOfYear(), dateTime.getHour(), dateTime.getMinute()));
        } else {
            System.out.println(String.format("%d %d %02d:%02d:%02d", dateTime.getYear(),
                    dateTime.getDayOfYear(), dateTime.getHour(), dateTime.getMinute(),
                    dateTime.getSecond()));
        }
    }
}