import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] incomes = new int[size];
        for (int i = 0; i < size; i++) {
            incomes[i] = scanner.nextInt();
        }
        int[] percents = new int[size];
        for (int i = 0; i < size; i++) {
            percents[i] = scanner.nextInt();
        }
        double[] taxes = new double[size];
        int largestOrder = Integer.MIN_VALUE;
        double largestTax = Double.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            taxes[i] = incomes[i] * percents[i] / 100.0;
            if (taxes[i] > largestTax) {
                largestOrder = i + 1;
                largestTax = taxes[i];
            }
        }
        if (largestOrder >= 0) {
            System.out.println(largestOrder);
        }
    }
}