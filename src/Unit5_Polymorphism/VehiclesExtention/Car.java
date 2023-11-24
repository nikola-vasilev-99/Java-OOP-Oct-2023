package Unit5_Polymorphism.VehiclesExtention;


public class Car extends Vehicle {
    private static final double TRAVEL_DURING_SUMMER = 0.9;
    public Car(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
        this.fuelConsumptionPerKm = getFuelConsumptionPerKm() * TRAVEL_DURING_SUMMER;
    }
}
