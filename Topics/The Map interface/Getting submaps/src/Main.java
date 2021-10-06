import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int count = scanner.nextInt();
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            int key = scanner.nextInt();
            String val = scanner.next();
            map.put(key, val);
        }
        SortedMap<Integer, String> subMap = map.subMap(start, end + 1);
        for (Map.Entry<Integer, String> entry : subMap.entrySet()) {
            System.out.println(String.format("%d %s", entry.getKey(), entry.getValue()));
        }
    }
}