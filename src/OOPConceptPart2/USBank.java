package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	// only method declaration
	// no method body - only method prototype
	// vars value will not be changed. Its final/constant in nature
	// no static method in Interface
	// no main method in interface
	// we can not create object of interface
	// Interface is abstract in nature
	// In interface we can declare the vaiables, vars are by default satic in nature
	

}
