public class PlayingCard {

    //suit enum
    enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }
    enum Rank {
        Ace,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King
    }
    public Suit suit;
    public Rank rank;
    //instance variabless

    public PlayingCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return this.rank + " of " + this.suit;
    }
    {
        this.suit = suit;
        this.rank = rank;

    }

	//complete this method
	static public PlayingCard[] standardDeck()
	{
        PlayingCard[] deck = new PlayingCard[52];
	    int count = 0; //set count to 0 to start ( int i = 0; )
	    for ( Suit suit : Suit.values()) //loop thru values
        {
	        for ( Rank rank : Rank.values()) 
            {
	            //new deck increments count into the neww plaaaying card with values of suit and rank
	            deck[count++] = new PlayingCard(suit, rank);
             }
        }
        return deck;

	}


    public static void main(String[] args)
	{
		PlayingCard[] deck = PlayingCard.standardDeck();
        for(int i = 0;i<4;i++)
        {
    System.out.println(deck[i]);
        }
	}

}
