package Unit4_InterfacesAndAbstraction.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Birthable> birthableList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            switch (data[0]) {
                case "Citizen":
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String id = data[3];
                    String birthDate = data[4];
                    Citizen citizen = new Citizen(name, age, id, birthDate);
                    birthableList.add(citizen);
                    break;
                case "Robot":
                    String model = data[1];
                    id = data[2];
                    Robot robot = new Robot(id, model);
                    break;
                case "Pet":
                    name = data[1];
                    birthDate = data[2];
                    Pet pet = new Pet(name, birthDate);
                    birthableList.add(pet);
                    break;
            }
            input = scanner.nextLine();
        }
        String year = scanner.nextLine();
        boolean isFound = false;
        for(Birthable thingWithABirthday: birthableList) {
            if (thingWithABirthday.getBirthDate().endsWith(year)) {
                isFound = true;
                System.out.println(thingWithABirthday.getBirthDate());
            }
        }
        if (!isFound) {
            System.out.println("<no output>");
        }
    }
}
