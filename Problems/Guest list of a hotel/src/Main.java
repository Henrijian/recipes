//put imports you need here

import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        while (scanner.hasNext()) {
            String name = scanner.next().trim();
            if (name.length() > 0) {
                stack.push(name);
            }
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}