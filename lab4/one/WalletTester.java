package one;

public class WalletTester {
	public static void main(String[] args){
		DriverLicence licence = new DriverLicence("Chris","DL12345CJ", 2020);
		IDCard id1 = new IDCard("Bob","987654");
		IDCard id2 = new IDCard("Joe","ID56789");
		Wallet wallet1 = new Wallet();
		wallet1.addCard(licence);
		System.out.println(wallet1.formatCards());
		wallet1.addCard(id1);
		System.out.println(wallet1.formatCards());
		wallet1.addCard(id2);
		System.out.println(wallet1.formatCards());
		Boolean y = licence.isExpired();
		System.out.println("Drivers licence expired: " + y);
	}
}
