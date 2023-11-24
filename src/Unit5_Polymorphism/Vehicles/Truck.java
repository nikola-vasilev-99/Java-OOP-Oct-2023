package Unit5_Polymorphism.Vehicles;

public class Truck extends Vehicle{

    public Truck(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm + 1.6);
    }

    @Override
    public void refuel(double litres) {
        super.setFuelQuantity(super.getFuelQuantity() + (litres * 0.95));
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", this.getFuelQuantity());
    }
}
