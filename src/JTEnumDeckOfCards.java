enum Suit {DIAMONDS, CLUBS, HEARTS, SPADES}

enum Rank {DEUCE, THREE, FOUR, FIVE, SIX, SEVEN,
    EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

class cards {
    private final Rank rank;
    private final Suit suit;

    public cards (Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }



}


public class JTEnumDeckOfCards {
    public static void main(String[] args){

        cards[] cards = new cards[52];
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()){
                cards[i++] = new cards(rank, suit);
                System.out.println(cards[i-1]);
            }
        }





    }
}
