import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.next();
        int num;
        switch (numStr) {
            case "one":
                num = 1;
                break;
            case "two":
                num = 2;
                break;
            case "three":
                num = 3;
                break;
            case "four":
                num = 4;
                break;
            case "five":
                num = 5;
                break;
            case "six":
                num = 6;
                break;
            case "seven":
                num = 7;
                break;
            case "eight":
                num = 8;
                break;
            case "nine":
                num = 9;
                break;
            default:
                return;
        }
        System.out.println(num);
    }
}