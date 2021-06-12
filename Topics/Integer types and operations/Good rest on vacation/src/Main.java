import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        int totalFoodCost = foodCostPerDay * duration;
        int totalHotelCost = hotelCostPerNight * (duration - 1);
        int totalFlightCost = flightCost * 2;
        int totalVacationCost = totalFoodCost + totalHotelCost + totalFlightCost;
        System.out.println(totalVacationCost);
    }
}