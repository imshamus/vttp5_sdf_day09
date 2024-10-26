package Task11;

public enum CardValue {

    ACE(0),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10); // semi-colon required to add fields, methods, constructors to the enum
    
    // Attributes
    private int value;

    // Constructors
    private CardValue(int value) {
        this.value = value; 
    }  

    // Method
    public int getCardValue() {
        return value;
    }
    
    public int getAceValue(int currentTotal) {
        if (currentTotal + 11 > 21) {
            return 1;
        }
        else {
            return 11;
        }
    }
}
