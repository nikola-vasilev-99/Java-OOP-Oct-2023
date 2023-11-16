package Unit4_InterfacesAndAbstraction.SayHelloExtended;

public abstract class BasePerson implements Person {
    private String name;

    public BasePerson(String name) {
        setName(name);
    }
    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }




}
