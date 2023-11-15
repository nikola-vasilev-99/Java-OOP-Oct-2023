package Unit4_InterfacesAndAbstraction.TestPAckage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Engine engine = new ElectricEngine();
        Car currentCar = new Car(engine);

        currentCar.runMaintenance();
    }
}
