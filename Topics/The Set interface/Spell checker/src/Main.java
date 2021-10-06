import java.util.*;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int wordCount = Integer.parseInt(scanner.nextLine());
        Set<String> words = new HashSet<>();
        for (int i = 0; i < wordCount; i++) {
            words.add(scanner.nextLine().toLowerCase());
        }
        int lineCount = Integer.parseInt(scanner.nextLine());
        Set<String> printed = new HashSet<>();
        for (int i = 0; i < lineCount; i++) {
            String line = scanner.nextLine();
            String[] texts = line.split("\\s+");
            for (String text : texts) {
                if (!words.contains(text.toLowerCase()) && !printed.contains(text.toLowerCase())) {
                    System.out.println(text);
                    printed.add(text.toLowerCase());
                }
            }
        }
    }
}