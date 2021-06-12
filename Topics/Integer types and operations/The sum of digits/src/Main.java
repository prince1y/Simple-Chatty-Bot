import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int inputInteger = scanner.nextInt();
        int firstDigit = inputInteger / 100;
        int tensRemainder = inputInteger % 100;
        int secondDigit = tensRemainder / 10;
        int thirdDigit = tensRemainder % 10;

        System.out.println(firstDigit + secondDigit + thirdDigit);
    }
}