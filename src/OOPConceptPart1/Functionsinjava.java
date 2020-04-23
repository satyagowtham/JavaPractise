package OOPConceptPart1;

public class Functionsinjava {

	public static void main(String[] args) {
		
		Functionsinjava obj = new Functionsinjava();
		// After creating of the object, Copy of all non static methods will be given to this method
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String k = obj.qa();
		System.out.println(k);
		
		int m =obj.division(10,2);
		System.out.println(m);
		
		// main method is void because it never return a value
		
		}
	// Non Static Functions
	// Return Type is Nothing
	public void test(){
		System.out.println("My First Test");

		
	}
	// Return Type is int
	public int pqr() {
		System.out.println("Second Method/Function");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	// Return Type is String
	public String qa() {
		System.out.println("qa Method/Function");
		
		String s = "Hello";
		return s;
	}
	// Return Type is int
	public int division(int x, int y) {
		System.out.println("Division Method");
		int d = x/y;
		return d;
	}
	
	

}
