package Unit1_WorkingWithAbstraction.EX.EX4_TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] colors = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        List<Light> lights = new ArrayList<>();
        for (String color: colors) {
            Light light = new Light(Color.valueOf(color));
            lights.add(light);
        }

        for (int i = 1; i <= n; i++) {
            lights.forEach(light -> {
                light.changeColor();
                System.out.print(light.getColor() + " ");
            });
            System.out.println();
        }
    }
}
