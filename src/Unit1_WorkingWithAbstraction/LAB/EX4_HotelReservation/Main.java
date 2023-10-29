package Unit1_WorkingWithAbstraction.LAB.EX4_HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        Season currentSeason = Season.valueOf(input[2]);
        DiscountType discountType = DiscountType.valueOf(input[3]);

        double finalPrice = PriceCalculator.calculateFinalPrice(pricePerDay, numberOfDays, currentSeason, discountType);
        System.out.printf("%.2f", finalPrice);
    }
}
