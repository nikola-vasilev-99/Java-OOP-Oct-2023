package CarShopExtended;

public class Audi extends CarImpl implements Rentable{
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer miniRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = miniRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "Minimum rental period of " + this.minRentDay + ". Price per day " + this.pricePerDay;
    }
}
