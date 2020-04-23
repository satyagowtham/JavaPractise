package JavaBasics;

public class SuperConcept1 extends SuperConcept{
	
	public SuperConcept1() {
		
		super(99,9);
		
		System.out.println("Child Class Constructor");
	}
	
	public static void main(String args[]) {
		
		SuperConcept1 obj = new SuperConcept1();
	}

}
