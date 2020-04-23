package OOPConceptPart1;

public class Car {
	
	int mod;
	int wheels;
	String Name;

	public static void main(String[] args) {
		
		// new Car() is the object
		// a,b,c are object reference variables
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2012;
		a.wheels = 4;
		a.Name = "AUDI";
		
		b.mod = 2013;
		b.wheels = 4;
		b.Name = "BMW";
		
		c.mod = 2014;
		c.wheels = 4;
		c.Name = "Beneze";
		
		System.out.println(a.mod+a.wheels+ ' '+a.Name);
		System.out.println(b.mod+ b.wheels+' '+b.Name);
		System.out.println(c.mod+c.wheels+' '+ c.Name);
		
		System.out.println(a.mod);
		System.out.println("Before Reference");
		
		
		a=b;
		b=c;
		c=a;
		
		
		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 99;
		System.out.println(a.mod);
		
		

	}

}
