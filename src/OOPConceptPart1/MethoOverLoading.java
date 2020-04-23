package OOPConceptPart1;

public class MethoOverLoading {

	public static void main(String[] args) {
		MethoOverLoading obj = new MethoOverLoading();
		
		obj.sum();
		obj.sum(9);
		obj.sum(99, 999);
		

	}
	
	public static void main(int x) {
		
	}
	public static void main(int x, String z) {
		
	}
	// We can overload main method also.
	// Method Overloading- when the method name is same with different arguements or input parameters within the same class.
	// you can not create a method inside a method
	// duplicate methods- i.e same method name with same number of arguments are not allowed.
	
	public void sum() {
		System.out.println("Sum method with zero parameter....");
	}
	public void sum(int x) {
		System.out.println("Sum method with one input parameter");
		System.out.println(x);
		
	}
	public void sum(int y, int z) {
		System.out.println("Sum method with two input parameter");
		System.out.println(z/y);
	}

}
