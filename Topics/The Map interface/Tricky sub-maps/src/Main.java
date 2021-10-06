import java.util.*;

class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        // Write your code here
        if (map == null) {
            return null;
        }
        if (map.size() == 0) {
            return map;
        }
        Map<Integer, String> result = new LinkedHashMap<>();
        if (map.firstKey() % 2 == 0) {
            SortedMap<Integer, String> tail = map.tailMap(map.lastKey() - 4, true);
            while (tail.size() > 0) {
                result.put(tail.lastKey(), tail.get(tail.lastKey()));
                tail.remove(tail.lastKey());
            }
        } else {
            SortedMap<Integer, String> head = map.headMap(map.firstKey() + 4, true);
            while (head.size() > 0) {
                result.put(head.lastKey(), head.get(head.lastKey()));
                head.remove(head.lastKey());
            }
        }
        return result;
    }
}

/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}