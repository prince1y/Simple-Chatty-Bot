import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (-15 < a && a <= 12) {
            System.out.println("True");
        } else if (14 < a && a < 17) {
            System.out.println("True");
        } else if (a >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}