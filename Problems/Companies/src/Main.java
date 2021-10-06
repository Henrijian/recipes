import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        while (scanner.hasNext()) {
            inputs.add(scanner.next());
        }
        System.out.println(inputs);
    }
}