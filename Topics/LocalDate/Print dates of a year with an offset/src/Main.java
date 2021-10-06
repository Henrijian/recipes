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
        if (!scanner.hasNext()) {
            return;
        }
        int delta = scanner.nextInt();
        int year = data.getYear();
        while (year == data.getYear()) {
            System.out.println(data);
            data = data.plusDays(delta);
        }
    }
}