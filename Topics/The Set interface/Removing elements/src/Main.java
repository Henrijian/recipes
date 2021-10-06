import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        // write your code here
        String[] numStrs = str.split(" ");
        Set<Integer> result = new HashSet<>();
        for (String numStr : numStrs) {
            result.add(Integer.parseInt(numStr));
        }
        return result;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        Set<Integer> greaterThan10 = new HashSet<>();
        for (int num : set) {
            if (num > 10) {
                greaterThan10.add(num);
            }
        }
        set.removeAll(greaterThan10);
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}