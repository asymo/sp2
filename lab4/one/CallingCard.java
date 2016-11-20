package one;

public class CallingCard extends Card{
	private int cardNumber;
	private int pin;
	private FINAL boolean expired = false;
	
	/**
	 * Constucts a CallingCard object with given name, card number and pin 
	 * @param name the given name
	 * @param cardNumber 
	 * @param pin
	 */
	public CallingCard(String name, int cardNumber, int pin){
		super(name);
		this.cardNumber = cardNumber;
		this.pin = pin;
	}
	
	/**
	 * Constructs a CallingCard object with an empty string name, card number and pin
	 * Sets card number and pin to 0
	 */
	public CallingCard(){
		this("", 0, 0);
	}
	
	/**
	 * Returns a String representation of the instance variables
	 * 
	 * @return string denoting the object
	 */
	@Override
	public String format(){
		super.format();
		return ", Card Number: " + cardNumber + ", PIN: " + pin;
	}

	/**
	 * Returns a boolean with a value of false as card cannot expire
	 * 
	 * @return boolean with value false
	 */
	@Override
	public boolean isExpired(){
		return expired;
	}
}
