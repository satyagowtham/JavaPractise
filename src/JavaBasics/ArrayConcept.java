package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i.length);
		//System.out.println(i[4]); // array index out of bound exception
		
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		
		Object g[] = new Object[6];
		g[0] = "Amma";
		g[1] = 'A';
		g[2] = 99;
		g[3] = 99.99;
		g[4] = "17/09/1993";
		g[5] = "Malakapalli";
		
		System.out.println(g[3]);
		System.out.println(g[0]);
		System.out.println(g.length);
		
		

		
		
		

	}

}
