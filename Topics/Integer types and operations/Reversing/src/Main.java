import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int inputDigit = scanner.nextInt();
        int firstDigit = inputDigit / 100;
        int remainder = inputDigit % 100;
        int secondDigit = remainder / 10;
        int thirdDigit = remainder % 10;

        int newDigit = thirdDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println(newDigit);

    }
}