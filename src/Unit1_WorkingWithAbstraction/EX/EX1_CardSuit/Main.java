package Unit1_WorkingWithAbstraction.EX.EX1_CardSuit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        CardSuits[] cardSuits = CardSuits.values();
        for (CardSuits currCardSuit: cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", currCardSuit.ordinal(), currCardSuit);
        }
    }
}
