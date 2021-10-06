import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        double a;
        double b;
        double c;
        double r;
        double area = 0;
        switch (type) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                area = Math.sqrt((s - a) * (s - b) * (s - c) * s);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                break;
            case "circle":
                r = scanner.nextDouble();
                area = r * r * 3.14;
                break;
        }
        System.out.println(area);
    }
}