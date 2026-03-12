public class Game {
    Deck deck= new Deck();
    Player player[];
    Game(int numberOfPlayers){
        player=new Player[numberOfPlayers];
        player[0]=new Player("Adil");
    }
    Game(String names[]) {
        player = new Player[names.length];
        for (int i = 0; i < names.length; i++) 
            player[i] = new Player(names[i]);
    }
    public void play(int rounds) {
        deck.shuffle();
        for (int r = 1; r <= rounds; r++) {
            System.out.println("Round " + r);
            int topVal = -1;
            int winnerIdx = -1;

            for (int i = 0; i < player.length; i++) {
                Card drawn = deck.drawOne();
                player[i].hand = new Card[]{drawn};
                System.out.println(player[i].name + " drew " + drawn);

                int currentVal = drawn.getValue();
                if (currentVal > topVal) {
                    topVal = currentVal;
                    winnerIdx = i;
                }
            }

            if (winnerIdx != -1) {
                player[winnerIdx].score++;
                System.out.println("Round Winner: " + player[winnerIdx].name + "\n");
            }
        }
        showFinalResults();
    }

    public void showFinalResults() {
        Player best = player[0];
        for (int i = 1; i < player.length; i++) 
            if (player[i].score > best.score) 
                best = player[i];
        System.out.println("Final Winner: " + best.name + " with " + best.score + " points");
    }

    public String toString() {
        StringBuilder playersDetails = new StringBuilder();
        for (int i = 0; i < player.length; i++) 
            playersDetails.append(player[i]);
            System.out.println();
        return playersDetails.toString();
    }
}
    class Player {
       String name;
       int score;
       Card[] hand;

       Player(String name) {
          this.name = name;
       }

       public String toString() {
           return String.format("%s %d %s", name, score, hand);
    }

}

enum RankValue {Ace(14),Two(2),Three(3),Four(4),Five(5),Six(6),Seven(7),Eight(8),Nine(9),Ten(10),Jack(11),Queen(12),King(13);
    

    private final int value;
    RankValue(int value) { this.value = value; }
    public int getValue() { return value; }
}