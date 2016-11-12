package one;

public class DriverLicence extends IDCard {
	private int expirationYear;
	
	/**
	 * Constructs a DriverLicence object with the given name, ID number and expiration year
	 * @param name the given name
	 * @param idNumber the given ID number
	 * @param expirationYear the given expiration year of the driver licence
	 */
	DriverLicence(String name, String idNumber, int expirationYear){
		super(name, idNumber);
		this.expirationYear = expirationYear;
	}
	
	/**
	 * Returns a String representation of the instance variables
	 * 
	 * @return string denoting the object
	 */
	@Override
	public String format(){
		super.format();
		return ", Expiration Year: " + expirationYear;
	}
}
