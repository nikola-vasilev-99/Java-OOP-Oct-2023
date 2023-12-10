package Unit5_Polymorphism.WildFarm_MartinsSolution;

public abstract class Food {

    private int quantity;

    protected Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}