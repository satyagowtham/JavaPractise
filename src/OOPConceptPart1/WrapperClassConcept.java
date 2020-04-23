package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		// Integer, Character, Boolean, Double are wrapper classes
		
		String x = "999";
		System.out.println(x);
		
		// String to int
		int i = Integer.parseInt(x);
		System.out.println(i+1);
		
		// String to double
		String y = "999.99";
		System.out.println(y);
		
		
		double j = Double.parseDouble(y);
		System.out.println(j+0.01);
		
		// String to boolean
		String z = "true";
		boolean k = Boolean.parseBoolean(z);
		System.out.println(k);
		
		// integer to string
		int m = 26;
		System.out.println(m+24);
		
		String n = String.valueOf(m);
		System.out.println(n+24);
		
		// integer to double
		int o = 99;
		System.out.println(o);
		
		double d = Double.valueOf(o+1.99);
		System.out.println(d);
		
		String u = "100A";
		Integer.parseInt(u);

	}

}
