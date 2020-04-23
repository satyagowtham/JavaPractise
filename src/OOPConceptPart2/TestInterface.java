package OOPConceptPart2;

public class TestInterface {

	// If a class is implementing any interface, then its manditory to define/override the methods of interface
	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		HSBCBank h = new HSBCBank();
		
		h.credit();
		h.debit();
		h.transfermoney();
		h.carloan();
		h.educationloan();
		h.MutualFunds();
		
		// Dynamic Polymorphism
		// Child class object can be refred by parent interface variable
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		
		
	

	}

}
