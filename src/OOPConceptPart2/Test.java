package OOPConceptPart2;

public class Test {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		// Static polymorphism.... compile-time polymorphism
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("!!!!!!!!!!!!!!");
		
		
		Car c = new Car();
		
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("!!!!!!!!!!!!!!");
		
		
		// Top Casting
		Car c1 = new BMW(); // child class object can be referred by parent class reference variable--dynamic polymorphism or runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		// Down Casting
		BMW b1 = (BMW)new Car();// ClassCastException
		
		

	}

}
