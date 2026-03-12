public class Demo {
    public static void main(String[] args) {


        //     Deck deck = new Deck();
        //       deck.displayDeck();
        //     deck.shuffle();
        //
        //     System.out.println();
        //     deck.displayDeck();
        //

        //Same game=new Game(4);
        String names[] = {"Adil", "Umar", "Rizwan"};
        Game game1 = new Game(names);
        //System.out.println(game1);
        game1.play(6);
    }
}