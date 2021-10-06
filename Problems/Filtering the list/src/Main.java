import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        while (scanner.hasNext()) {
            nums.add(scanner.nextInt());
        }
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.print(String.format("%d ", nums.get(i)));
            }
        }
    }
}