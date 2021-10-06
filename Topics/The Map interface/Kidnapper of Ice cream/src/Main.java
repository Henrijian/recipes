import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String newspaper = scanner.nextLine().trim();
        String letter = scanner.nextLine().trim();
        Map<String, Integer> newspaperWordCount = new HashMap<>();
        for (String word : newspaper.split("\\s+")) {
            if (newspaperWordCount.containsKey(word)) {
                newspaperWordCount.put(word, newspaperWordCount.get(word) + 1);
            } else {
                newspaperWordCount.put(word, 1);
            }
        }
        boolean available = true;
        for (String word : letter.split("\\s+")) {
            if (!newspaperWordCount.containsKey(word) || newspaperWordCount.get(word) == 0) {
                available = false;
                break;
            } else {
                newspaperWordCount.put(word, newspaperWordCount.get(word) - 1);
            }
        }
        if (available) {
            System.out.println("You get money");
        } else {
            System.out.println("You are busted");
        }
    }
}