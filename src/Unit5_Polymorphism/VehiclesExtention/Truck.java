package Unit5_Polymorphism.VehiclesExtention;

public class Truck extends Vehicle {
    private static final double FUEL_REDUCTION = 0.95;
    private static final double TRAVEL_DURING_SUMMER = 1.6;

    public Truck(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
        this.fuelConsumptionPerKm = getFuelConsumptionPerKm() * TRAVEL_DURING_SUMMER;
    }

    @Override
    public void refuel(double litres) {
        super.refuel(litres * FUEL_REDUCTION);
    }
}
