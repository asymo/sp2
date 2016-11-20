package one;

/*
 * should be in a new package
 * 
 * package two;
 * inport one.Card;
 */

public class Wallet {
	
	 private Card card1; private Card card2;
	 

	/* hold cards in an array
	private FINAL
	int walletSize = 2;

	private Card[walletSize];
	/*
	
	/**
	 * Constructs a Wallet object with two objects of Card
	 */
	public Wallet(Card c1, Card c2){
		card1 = c1;
		card2 = c2;
	}

	/**
	 * Constructs a Wallet object with both cards set to NULL
	 */
	public Wallet() {
		this(null, null);
	}

	/**
	 * Constructs a Wallet object with one card being set to NULL
	 */
	public Wallet(Card c1) {
		this(c1, null);
	}

	/**
	 * Adds the specified card to the Wallet if there is space
	 * 
	 * @param c
	 *            Card to be added
	 */
	public void addCard(Card c) {
		if (card1 == null && card2 == null) {
			card1 = c;
		} else if (card1 == null) {
			card1 = c;
		} else if (card2 == null) {
			card2 = c;
		} else {
			System.out.println("Wallet is full");
		}
	}

	/*
	 public void addCard(Card c) {
		if (card1 == null) {
			card1 = c;
		} else if (card2 == null) {
			card2 = c;
		}
	}
	*/

	/**
	 * Returns a String of the information from the saved cards
	 * 
	 * @return String with card information
	 */
	public String formatCards() {
		String a;
		String b;
		if (card1 == null) {
			a = "card1(empty)";
		} else {
			a = card1.format();
		}
		if (card2 == null) {
			b = "card2(empty)";
		} else {
			b = card2.format();
		}
		return "[" + a + " | " + b + "]";
	}
	/*
	public String formatCards() {
		String card1Formatted = card1 == null ? "null" : card1.format();
		String card2Formatted = card2 == null ? "null" : card2.format();
		return "[" + card1Formatted + " | " + card2Formatted + "]";
	}
	*/

	/**
	 * Returns an integer of how many cards have expired
	 * 
	 * @return Integer of expired cards
	 */
	public int getExpiredCardCount() {
		return 0;
	}
}
