import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine().trim();
        String word2 = scanner.nextLine().trim();
        Map<Character, Integer> charCount1 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            c = Character.toLowerCase(c);
            if (charCount1.containsKey(c)) {
                charCount1.put(c, charCount1.get(c) + 1);
            } else {
                charCount1.put(c, 1);
            }
        }
        Map<Character, Integer> charCount2 = new HashMap<>();
        for (char c : word2.toCharArray()) {
            c = Character.toLowerCase(c);
            if (charCount2.containsKey(c)) {
                charCount2.put(c, charCount2.get(c) + 1);
            } else {
                charCount2.put(c, 1);
            }
        }
        Set<Character> repeatedChars = new HashSet<>(charCount1.keySet());
        repeatedChars.retainAll(charCount2.keySet());
        for (char c : repeatedChars) {
            int count1 = charCount1.get(c);
            int count2 = charCount2.get(c);
            if (count1 > count2) {
                charCount1.put(c, count1 - count2);
                charCount2.remove(c);
            } else if (count2 > count1) {
                charCount1.remove(c);
                charCount2.put(c, count2 - count1);
            } else {
                charCount1.remove(c);
                charCount2.remove(c);
            }
        }
        int removedCharCount = 0;
        for (int charCount : charCount1.values()) {
            removedCharCount += charCount;
        }
        for (int charCount : charCount2.values()) {
            removedCharCount += charCount;
        }
        System.out.println(removedCharCount);
    }
}