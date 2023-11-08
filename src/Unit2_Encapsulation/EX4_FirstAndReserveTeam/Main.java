package Unit2_Encapsulation.EX4_FirstAndReserveTeam;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Team team = new Team ("Black Eagles");

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Person personToAdd = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
            team.addPlayer(personToAdd);
        }

        System.out.printf("First team have %d players%n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players", team.getReserveTeam().size());
    }
}
