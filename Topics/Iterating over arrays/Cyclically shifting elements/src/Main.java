import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        int cursor = size-1;
        for (int i = 0; i < size; i++) {
            if (cursor >= size) {
                cursor = 0;
            }
            System.out.print(String.format("%d ", nums[cursor]));
            cursor++;
        }
    }
}