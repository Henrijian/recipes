import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while (scanner.hasNext()) {
            nums.add(scanner.nextInt());
        }
        int target = nums.remove(nums.size() - 1);
        int minDiff = Integer.MAX_VALUE;
        for (int num : nums) {
            int diff = Math.abs(num - target);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        PriorityQueue<Integer> nearestNums = new PriorityQueue<>();
        for (int num : nums) {
            int diff = Math.abs(num - target);
            if (diff == minDiff) {
                nearestNums.add(num);
            }
        }
        while (nearestNums.size() > 0) {
            System.out.print(String.format("%d ", nearestNums.poll()));
        }
    }
}