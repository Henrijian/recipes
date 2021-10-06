import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s");
        String search = scanner.nextLine().trim();
        System.out.println(Collections.frequency(List.of(tokens), search));
    }
}