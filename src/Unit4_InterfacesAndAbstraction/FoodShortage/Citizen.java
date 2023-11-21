package Unit4_InterfacesAndAbstraction.FoodShortage;

public class Citizen implements Buyer, Identifiable, Person{
    private String name;
    private int age;
    private String birthDate;
    private String id;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.id = id;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String getBirthDate() {
        return this.birthDate;
    }
}
