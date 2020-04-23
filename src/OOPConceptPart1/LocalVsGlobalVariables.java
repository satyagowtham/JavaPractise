package OOPConceptPart1;

public class LocalVsGlobalVariables {

	// Global Variables----class Variables
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		int i = 10;// Local variables
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		String s = obj.name;
		System.out.println(s);
		
		int x = obj.age;
		System.out.println(x);
	
	}
	public void sum() {
		int i = 10;// Local Variables
		int j = 20;// Local variables
		int age = 25;// Local Variables
		
	}

}
