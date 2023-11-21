package Unit4_InterfacesAndAbstraction.FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> mapOfBuyers= new HashMap<>();
        for (int person = 1; person <= numberOfPeople; person++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Buyer buyer = null;
            if (data.length == 4) {
                String id = data[2];
                String birthdate = data[3];
                buyer = new Citizen(name, age, id, birthdate);
            } else {
                String group = data[2];
                buyer = new Rebel(name, age, group);
            }
            mapOfBuyers.put(name, buyer);
        }

        String nameFromConsole = scanner.nextLine();
        while(!"End".equals(nameFromConsole)) {
            Buyer buyer = mapOfBuyers.get(nameFromConsole);
            if (buyer != null) {
                buyer.buyFood();
            }
            nameFromConsole = scanner.nextLine();
        }
        int total = mapOfBuyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(total);
    }
}
