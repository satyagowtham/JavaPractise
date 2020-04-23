package OOPConceptPart1;

public class StaticAndNonStatic {
	
	String name = "Tom"; // Non Static global variable
	static int age = 26; // Static global variable

	public static void main(String[] args) {
		
		// How to call static method and variables?
		// 1. Direct calling
		sum();
		// 2. calling by class name
		StaticAndNonStatic.sum();
		
		// static variables
		// 1. Direct calling
		System.out.println(age);
		
		// 2. calling by class name
		System.out.println(StaticAndNonStatic.age);
		
		

	}
	public void sendmail() { // Non Static Method
		System.out.println("Sendmail Method");
	}
	public static void sum() { // Static Method
		System.out.println("Sum Method");
	}

}
