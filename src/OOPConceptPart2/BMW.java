package OOPConceptPart2;

public class BMW extends Car{// has a relationship
	
	// when same method is present in parent class as well as child class  with the same name and same no of arguments is called Method Overriding
	public void start() {
		System.out.println("BMW Start...");
	}
	public void theftsafety() {
		System.out.println("BMW ...Theftsafety");
	}
	
	

}
