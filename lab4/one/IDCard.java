package one;

public class IDCard extends Card {
	private String idNumber;
	private FINAL boolean expired = false;
	
	/**
	 * Constructs an IDCard object with the given name and ID
	 * @param name the given name
	 * @param ID the given ID
	 */
	public IDCard(String name, String ID){
		super(name);
		idNumber = ID;
	}
	
	/**
	 * Returns a String representation of the instance variables
	 * 
	 * @return string denoting the object
	 */
	@Override
	public String format(){
		String x = super.format();
		return x + ", ID: " + idNumber;
	}
	
	/**
	 * Returns a boolean of false as card does not expire
	 * 
	 * @return boolean false
	 */
	@Override
	public boolean isExpired(){
		return expired;
	}
}
