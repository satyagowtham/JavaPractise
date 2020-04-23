package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 99;
		
		int b = -999;
		
		if(b>a) {
			System.out.println("b is the biggest number");
			
	
		}
		else {
			System.out.println("a is the biggest number");
		}
		
		// Nested if else
		
		int a1 = 9;
		int b1 = 99;
		int c1 = 199;
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else
			System.out.println("c1 is the greatest");

	}

}
