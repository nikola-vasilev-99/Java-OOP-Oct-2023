package Unit2_Encapsulation.EX4_PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch(toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
    }

    public double calculateCalories() {
        double toppingTypeCoef = 0;
        if (this.toppingType.equals("Meat")) {
            toppingTypeCoef = 1.2;
        } else if (this.toppingType.equals("Veggies")) {
            toppingTypeCoef = 0.8;
        } else if (this.toppingType.equals("Cheese")) {
            toppingTypeCoef = 1.1;
        } else if (this.toppingType.equals("Sauce")) {
            toppingTypeCoef = 0.9;
        }
        return 2 * this.weight * toppingTypeCoef;
    }
}
