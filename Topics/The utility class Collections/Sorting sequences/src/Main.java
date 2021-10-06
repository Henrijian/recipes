import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void sortInDescendingOrder(List<Integer> sequence) {
        // write your code here
        Collections.sort(sequence);
        Collections.reverse(sequence);
        String numStr = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            sb.append(numStr.charAt(numStr.length() - 1 - i));
        }
        String reversedNumStr = sb.toString();
        int reversedNum = Integer.parseInt(reversedNumStr);
        System.out.println(reversedNum);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> seq = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        sortInDescendingOrder(seq);
        seq.forEach(e -> System.out.print(e + " "));
    }
}