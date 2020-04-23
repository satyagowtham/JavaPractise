package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank {// we achieve multiple interface
	// is a relationship
	
	public void credit() {
		System.out.println(" Credit of HSBC Bank");
	}
	public void debit() {
		System.out.println(" Debit of HSBC Bank");
	}
	public void transfermoney() {
		System.out.println(" Transfer Money of HSBC Bank");
	}
	public void educationloan() {
		System.out.println("Education Loan");
	}
	public void carloan() {
		System.out.println("Car Loan");
	}
	public void MutualFunds() {
		System.out.println("Mutual funds");
	}

	
}
