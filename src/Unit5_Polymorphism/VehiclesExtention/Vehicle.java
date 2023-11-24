package Unit5_Polymorphism.VehiclesExtention;

import java.text.DecimalFormat;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumptionPerKm;
    protected double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double km) {
        DecimalFormat df = new DecimalFormat("0.##");
        double neededFuel = km * getFuelConsumptionPerKm();
        if (getFuelQuantity() >= neededFuel) {
            setFuelQuantity(getFuelQuantity() - neededFuel);
            System.out.printf("%s travelled %s km%n", getClass().getSimpleName(), df.format(km));
        } else {
            System.out.printf("%s needs refueling%n", getClass().getSimpleName());
        }
    }

    public void refuel(double litres) {
        if (litres <= 0) {
            System.out.println("Fuel must be a positive number");
            return;
        }
        double newAmountOfFuel = this.getFuelQuantity() + litres;
        if (newAmountOfFuel > this.getTankCapacity()) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.setFuelQuantity(newAmountOfFuel);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), getFuelQuantity());
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }
}
