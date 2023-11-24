package Unit5_Polymorphism.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carData = getArray(scanner);
        double fuelQuantityCar = Double.parseDouble(carData[1]);
        double litresPerKmCar = Double.parseDouble(carData[2]);
        Vehicle car = new Car(fuelQuantityCar, litresPerKmCar);

        String[] truckData = getArray(scanner);
        double fuelQuantityTruck = Double.parseDouble(truckData[1]);
        double litresPerKmTruck = Double.parseDouble(truckData[2]);
        Vehicle truck = new Truck(fuelQuantityTruck, litresPerKmTruck);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= commandsCount; i++) {
            String[] commandArr = getArray(scanner);
            String command = commandArr[0];
            String vehicleType = commandArr[1];

            switch (command) {
                case "Drive":
                    double distance = Double.parseDouble(commandArr[2]);
                    if (vehicleType.equals("Car")) {
                        car.drive(distance);
                    } else if (vehicleType.equals("Truck")) {
                        truck.drive(distance);
                    }
                    break;
                case "Refuel":
                    double refueledLitres = Double.parseDouble(commandArr[2]);
                    if (vehicleType.equals("Car")) {
                        car.refuel(refueledLitres);
                    } else if (vehicleType.equals("Truck")) {
                        truck.refuel(refueledLitres);
                    }
                    break;
            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
    }

    private static String[] getArray(Scanner scanner) {
        return scanner.nextLine().split(" ");
    }
}
