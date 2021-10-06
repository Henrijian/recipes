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
        int maxAscendingLength = 0;
        int i = 0;
        while (i < nums.length) {
            int ascendingLength = 1;
            int j = i + 1;
            while (j < nums.length) {
                if (nums[j-1] <= nums[j]) {
                    ascendingLength++;
                } else {
                    break;
                }
                j++;
            }
            maxAscendingLength = Math.max(ascendingLength, maxAscendingLength);
            i = j;
        }
        System.out.println(maxAscendingLength);
    }
}