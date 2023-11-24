package Unit5_Polymorphism.Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public abstract String explainSelf();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favouriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favouriteFood = favoriteFood;
    }
}
