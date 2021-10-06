import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalTime start1 = LocalTime.parse(scanner.next());
        LocalTime end1 = LocalTime.parse(scanner.next());
        LocalTime start2 = LocalTime.parse(scanner.next());
        LocalTime end2 = LocalTime.parse(scanner.next());
        boolean isIntersect = (start2.compareTo(start1) >= 0 && start2.compareTo(end1) <= 0)
                || (end2.compareTo(start1) >= 0 && end2.compareTo(end1) <= 0)
                || (start1.compareTo(start2) >= 0 && start1.compareTo(end2) <= 0)
                || (end1.compareTo(start2) >= 0 && end1.compareTo(end2) <= 0);
        System.out.println(isIntersect);
    }
}