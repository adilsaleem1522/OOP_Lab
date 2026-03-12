public class Card {
    private final String SUIT;
    private final String RANK;

    public Card(String suit, String rank) {
        this.SUIT = suit;
        this.RANK = rank;
    }
       public int getValue() {
        try {
        return Integer.parseInt(RANK); 
    } catch (NumberFormatException e) {
        if 
         (RANK.equals("Jack")) return RankValue.Jack.getValue();
        if 
         (RANK.equals("Queen")) return RankValue.Queen.getValue();
        if
         (RANK.equals("King")) return RankValue.King.getValue();
        if 
         (RANK.equals("Ace")) return RankValue.Ace.getValue();
    }
    return 0;
  }
    public String toString() {
        return String.format("%s of %s", RANK, SUIT);
    }
    
    public String getSUIT() {
        return SUIT;
    }

    public String getRANK() {
        return RANK;
    }
}