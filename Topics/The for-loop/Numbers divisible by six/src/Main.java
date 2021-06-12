import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int input;
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            input = scanner.nextInt();
                if (input % 6 == 0) {
                    sum += input;
                }

        }
        System.out.println(sum);

    }
}
