//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String education = scanner.nextLine();
            int experience = Integer.parseInt(scanner.nextLine());
            String cuisine = scanner.nextLine();
            System.out.println(String.format("The form for %s is completed. We " +
                    "will contact you if we need a chef that cooks %s dishes.",
                    name, cuisine));
        }
    }
}