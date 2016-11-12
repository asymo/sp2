package one;

public class Wallet {
	private Card card1;
	private Card card2;
	
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
	public Wallet(){
		this(null, null);
	}
	
	/**
	 * Constructs a Wallet object with one card being set to NULL
	 */
	public Wallet(Card c1){
		this(c1, null);
	}
}
