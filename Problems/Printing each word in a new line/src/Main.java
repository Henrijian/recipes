import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        while (scanner.hasNext()) {
            String token = scanner.next().trim();
            if (token.length() > 0) {
                queue.add(token);
            }
        }
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}