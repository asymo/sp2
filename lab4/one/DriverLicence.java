package one;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
		String x = super.format();
		return x + ", Expiration Year: " + expirationYear;
	}
	
	/**
	 * Returns a boolean from comparing the expiration date to the current date
	 * 
	 * @return boolean, true if current year is greater than the expiration year
	 */
	@Override
	public boolean isExpired(){
		GregorianCalendar calendar = new GregorianCalendar();
		int currentYear = calendar.get(Calendar.YEAR);
		if(currentYear > expirationYear){
			return true;
		} else {
			return false;
		}
	}
}
