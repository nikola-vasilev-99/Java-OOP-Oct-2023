package Unit1_WorkingWithAbstraction.LAB.EX2_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] rectangleCoordinates = getCoordinates(scanner);

        Point bottomLeft = new Point(rectangleCoordinates[0], rectangleCoordinates[1]);
        Point topRight = new Point(rectangleCoordinates[2], rectangleCoordinates[3]);

        Rectangle newRectangle = new Rectangle(bottomLeft, topRight);

        int lines = Integer.parseInt(scanner.nextLine());
        for (int line = 1; line <= lines; line++) {
            int [] pointCoordinates = getCoordinates(scanner);
            Point currentPointToCheck = new Point(pointCoordinates[0], pointCoordinates[1]);
            System.out.println(newRectangle.contains(currentPointToCheck));
        }
    }
    private static int[] getCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine()
                        .split("\\s+")).mapToInt(Integer::parseInt)
                        .toArray();
    }
}
