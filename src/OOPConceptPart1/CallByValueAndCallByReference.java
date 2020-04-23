package OOPConceptPart1;

public class CallByValueAndCallByReference {

	public static void main(String[] args) {
	
		int x = 10;
		int y = 20;
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		
		obj.testsum(x, y);// call by value or pass by value
		
		
	

	}
	
	public int testsum(int x, int y) {
		int a = 30;
		int b = 40;
		int c = a+b;
		return c;
		
	}

}
