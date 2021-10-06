import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTimeBound1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime dateTimeBound2 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime startDateTime = dateTimeBound1.compareTo(dateTimeBound2) < 0 ? dateTimeBound1 : dateTimeBound2;
        LocalDateTime endDateTime = startDateTime.equals(dateTimeBound1) ? dateTimeBound2 : dateTimeBound1;
        int inRangeCount = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
            if (dateTime.isAfter(startDateTime) || dateTime.isEqual(startDateTime)) {
                if (dateTime.isBefore(endDateTime)) {
                    inRangeCount++;
                }
            }
        }
        System.out.println(inRangeCount);
    }
}