package Task11enum;

public class Card {

    // Each card has a suit and a value
    private Suit suit;
    private CardValue value;

    // Constructor
    public Card(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    // Getters & Setters
    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValue getValue() {
        return value;
    }

    public void setValue(CardValue value) {
        this.value = value;
    }

    // Methods
    @Override // override toString() method to display object meaningfully, else it would be classname@Hashcode like Task11.Card@548c4f57
    public String toString()
    {
        return value + " of " + suit;
    }
    
}
