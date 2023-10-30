package Unit1_WorkingWithAbstraction.EX.EX3_CardsWithPower;

import java.util.Scanner;

public class Card {
    private CardRanks cardRank;
    private CardSuits cardSuit;
    private int power;

    public Card(CardRanks cardRank, CardSuits cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public CardRanks getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRanks cardRank) {
        this.cardRank = cardRank;
    }

    public CardSuits getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuits cardSuit) {
        this.cardSuit = cardSuit;
    }

    public int getPower() {
        return this.cardRank.getRankPower() + this.cardSuit.getSuitPower();
    }

    public void setPower(int power) {
        this.power = power;
    }
}
