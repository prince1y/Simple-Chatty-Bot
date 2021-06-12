import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        firstGroup = firstGroup + (firstGroup % 2);
        thirdGroup = thirdGroup + (thirdGroup % 2);
        secondGroup = secondGroup + (secondGroup % 2);


        int sum = firstGroup + secondGroup + thirdGroup;
        System.out.println(sum / 2);
    }
}
