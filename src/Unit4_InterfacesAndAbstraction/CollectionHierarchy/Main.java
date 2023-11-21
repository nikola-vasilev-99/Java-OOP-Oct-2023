package Unit4_InterfacesAndAbstraction.CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myListImpl = new MyListImpl();

        performAddOperation(elements, addCollection);
        performAddOperation(elements, addRemoveCollection);
        performAddOperation(elements, myListImpl);

        performRemoveOperation(n, addRemoveCollection);
        performRemoveOperation(n, myListImpl);

    }
    private static void performAddOperation(String[] array, Addable addable) {
        for (String word : array) {
            System.out.print(addable.add(word) + " ");
        }
        System.out.println();
    }

    private static void performRemoveOperation(int count, AddRemovable addRemovable) {
        for (int i = 1; i <= count; i++) {
            System.out.print(addRemovable.remove() + " ");
        }
        System.out.println();
    }
}
