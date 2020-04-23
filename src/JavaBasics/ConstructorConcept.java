package JavaBasics;

public class ConstructorConcept {

	// Constructor will be called immediately after creating the object
	public ConstructorConcept() {
		System.out.println("Default Cnstructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("Single Parameter Constructor");
		System.out.println("The value of i " + i);
	}

	public ConstructorConcept(int j, int k) {
		System.out.println("double Parameter Constructor");
		System.out.println("The value of j " + j);
		System.out.println("The value of k " + k);

	}

	public static void main(String[] args) {

		ConstructorConcept cc = new ConstructorConcept();
		ConstructorConcept cc1 = new ConstructorConcept(99);
		ConstructorConcept cc2 = new ConstructorConcept(999, 9999);

	}

}
