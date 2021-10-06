import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        int bound = scanner.nextInt();
        int sum = 0;
        for (int num : nums) {
            if (num > bound) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}