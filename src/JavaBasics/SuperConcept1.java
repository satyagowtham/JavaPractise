package JavaBasics;

public class SuperConcept1 extends SuperConcept {

	public SuperConcept1(int i,int j) {

		super(i,j);

		System.out.println("Child Class Constructor");
	}
	public SuperConcept1(int i) {

		super(i);

		System.out.println("Child Class Constructor");
	}

	public static void main(String args[]) {

		SuperConcept1 obj = new SuperConcept1(9,99);
		SuperConcept1 obj1 = new SuperConcept1(999);
		
	}

}
