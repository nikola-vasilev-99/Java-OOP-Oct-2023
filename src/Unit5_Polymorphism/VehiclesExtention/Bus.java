package Unit5_Polymorphism.VehiclesExtention;

public class Bus extends Vehicle{
    private static final double DRIVE_WITH_AC_ON = 1.4;
    public Bus(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
    }


    @Override
    public void drive(double km) {
        super.setFuelConsumptionPerKm(this.fuelConsumptionPerKm + DRIVE_WITH_AC_ON);
        super.drive(km);
        super.setFuelConsumptionPerKm(this.fuelConsumptionPerKm - DRIVE_WITH_AC_ON);
    }

    public void driveEmpty(double km) {
        super.drive(km);
    }
}
