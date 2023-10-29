package Unit1_WorkingWithAbstraction.EX.EX2_CardRank;

public class Main {
    public static void main(String[] args) {
        CardRanks [] cardRanks = CardRanks.values();
        System.out.println("Card Ranks:");
        for (CardRanks currCardRank: cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", currCardRank.ordinal(), currCardRank.name());
        }
    }
}
