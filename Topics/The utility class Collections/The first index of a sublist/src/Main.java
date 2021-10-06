import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> list1 = Arrays.stream(scanner.nextLine().split("\\s")).collect(Collectors.toList());
        List<String> list2 = Arrays.stream(scanner.nextLine().split("\\s")).collect(Collectors.toList());
        int firstOccur = Collections.indexOfSubList(list1, list2);
        int lastOccur = Collections.lastIndexOfSubList(list1, list2);
        System.out.println(String.format("%d %d", firstOccur, lastOccur));
    }
}