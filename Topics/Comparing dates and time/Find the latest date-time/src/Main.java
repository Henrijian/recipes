import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Optional<LocalDateTime> optLeastDateTime = Optional.empty();
        for (int i = 0; i < n; i++) {
            LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
            if (optLeastDateTime.isEmpty()) {
                optLeastDateTime = Optional.of(dateTime);
            } else {
                LocalDateTime leastDateTime = optLeastDateTime.get();
                if (dateTime.isAfter(leastDateTime)) {
                    optLeastDateTime = Optional.of(dateTime);
                }
            }
        }
        optLeastDateTime.ifPresent(System.out::println);
    }
}