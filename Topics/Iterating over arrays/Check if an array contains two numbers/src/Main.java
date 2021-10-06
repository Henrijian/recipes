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
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int smallAdj = Math.min(n, m);
        int bigAdj = Math.max(n ,m);
        boolean adjacent = false;
        for (int i = 1; i < size; i++) {
            int small = Math.min(nums[i], nums[i-1]);
            int big = Math.max(nums[i], nums[i-1]);
            if (small == smallAdj && big == bigAdj) {
                adjacent = true;
                break;
            }
        }
        System.out.println(adjacent);
    }
}