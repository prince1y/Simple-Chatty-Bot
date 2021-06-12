import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int digit = scanner.nextInt();
        int output = digit + (2 - digit % 2);
        System.out.println(output);

        
    }
}
