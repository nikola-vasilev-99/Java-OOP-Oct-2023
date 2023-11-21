package Unit4_InterfacesAndAbstraction.CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private int maxSize;
    protected List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
        this.maxSize = 100;
    }
}
