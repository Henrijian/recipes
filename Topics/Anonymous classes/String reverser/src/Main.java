import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {
            @java.lang.Override
            public String reverse(String str) {
                StringBuilder sb = new StringBuilder();
                for (int i = str.length() - 1; i >= 0; i--) {
                    sb.append(str.charAt(i));
                }
                return sb.toString();
            }
        };

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {

        String reverse(String str);
    }

}