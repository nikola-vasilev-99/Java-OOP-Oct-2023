package Unit5_Polymorphism.VehiclesExtention;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle car = getVehicle(scanner);
        Vehicle truck = getVehicle(scanner);
        Vehicle bus = getVehicle(scanner);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= commandsCount; i++) {
            String[] commandArr = scanner.nextLine().split(" ");
            String command = commandArr[0];
            String vehicleType = commandArr[1];

            switch (command) {
                case "Drive":
                    double distance = Double.parseDouble(commandArr[2]);
                    vehicles.get(vehicleType).drive(distance);
                    break;
                case "Refuel":
                    double refueledLitres = Double.parseDouble(commandArr[2]);
                    vehicles.get(vehicleType).refuel(refueledLitres);
                    break;
                case "DriveEmpty":
                    distance = Double.parseDouble(commandArr[2]);
                    Vehicle vehicle = vehicles.get(vehicleType);
                    if (vehicle instanceof Bus) {
                        ((Bus) vehicle).driveEmpty(distance);
                    }
                    break;
            }
        }
        for (Map.Entry<String, Vehicle> entry : vehicles.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
    private static Vehicle getVehicle(Scanner scanner) {
        String[] vehicleData = scanner.nextLine().split(" ");
        double initialFuelQuantity = Double.parseDouble(vehicleData[1]);
        double litersPerKilometer = Double.parseDouble(vehicleData[2]);
        double tankCapacity = Double.parseDouble(vehicleData[3]);

        switch(vehicleData[0]) {
            case "Car":
                return new Car(initialFuelQuantity, litersPerKilometer, tankCapacity);
            case "Truck":
                return new Truck(initialFuelQuantity, litersPerKilometer, tankCapacity);
            case "Bus":
                return new Bus(initialFuelQuantity, litersPerKilometer, tankCapacity);
            default:
                return null;
        }
    }
}
