package Unit5_Polymorphism.Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumptionPerKm;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public void drive(double km){
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
        this.setFuelQuantity(this.getFuelQuantity() + litres);
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

    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

}
