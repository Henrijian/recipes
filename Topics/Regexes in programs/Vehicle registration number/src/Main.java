import java.util.Scanner;

class Main {
    public static boolean isValidRegisterNumber(String registerNumber) {
        if (registerNumber == null) {
            return false;
        }
        String regex = "[ABEKMHOPCTYX]\\d{3}[ABEKMHOPCTYX]{2}";
        return registerNumber.matches(regex);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        /* write your code here */
        System.out.println(isValidRegisterNumber(regNum));
    }
}