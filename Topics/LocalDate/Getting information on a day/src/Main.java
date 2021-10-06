import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) {
            return;
        }
        LocalDate data = LocalDate.parse(scanner.nextLine());
        int daysOfYear = data.getDayOfYear();
        int daysOfMonth = data.getDayOfMonth();
        System.out.println(String.format("%d %d", daysOfYear, daysOfMonth));
    }
}