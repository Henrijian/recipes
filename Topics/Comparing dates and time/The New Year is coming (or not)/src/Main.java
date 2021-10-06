import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.next());
        int addDays = scanner.nextInt();
        int dateYear = date.getYear();
        date = date.plusDays(addDays);
        boolean passYear = date.getYear() != dateYear;
        System.out.println(passYear);
    }
}