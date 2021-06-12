import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstHour = scanner.nextInt();
        int firstMinute = scanner.nextInt();
        int firstSecond = scanner.nextInt();

        int secondHour = scanner.nextInt();
        int secondMinute = scanner.nextInt();
        int secondSeconds = scanner.nextInt();

        int earlyTime = firstHour * 3_600 + firstMinute * 60 + firstSecond;
        int lateTime = secondHour * 3_600 + secondMinute * 60 + secondSeconds;

        System.out.println(lateTime - earlyTime);
    }
}