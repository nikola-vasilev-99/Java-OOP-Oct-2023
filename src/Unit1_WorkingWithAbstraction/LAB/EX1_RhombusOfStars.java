package Unit1_WorkingWithAbstraction.LAB;

import java.util.Scanner;

public class EX1_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        // print first half
        printTopHalf(size);
        // print second half
        printBottomHalf(size);
    }

    private static void printBottomHalf(int size) {
        for (int starCount = size - 1; starCount > 0; starCount--) {
            printRow(size, starCount);
        }
    }

    private static void printTopHalf(int size) {
        for (int starCount = 1; starCount <= size; starCount++) {
            printRow(size, starCount);
        }
    }

    private static void printRow(int size, int starCount) {
        for (int i = 1; i <= size - starCount; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starCount - 1; i++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
