import java.util.*;


class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        // write your code here
        Set<String> repeatedKeys = new HashSet<>(map1.keySet());
        repeatedKeys.retainAll(map2.keySet());
        int repeatedPairCount = 0;
        for (String repeatedKey : repeatedKeys) {
            String val1 = map1.get(repeatedKey);
            String val2 = map2.get(repeatedKey);
            if (val1.equals(val2)) {
                repeatedPairCount++;
            }
        }
        System.out.println(repeatedPairCount);
    }
}