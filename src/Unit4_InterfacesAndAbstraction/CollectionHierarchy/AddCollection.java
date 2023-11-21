package Unit4_InterfacesAndAbstraction.CollectionHierarchy;

public class AddCollection extends Collection implements Addable{

    @Override
    public int add(String item) {
        super.items.add(super.items.size(), item);
        return super.items.size() - 1;
    }
}
