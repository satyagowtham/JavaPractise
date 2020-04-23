package JavaBasics;

public class TwoDimensionsArray {

	public static void main(String[] args) {
		
		String x [][] = new String [3][5];
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[1].length);
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "1A";
		x[1][1] = "1B";
		x[1][2] = "1C";
		x[1][3] = "1D";
		x[1][4] = "1E";
		
		x[2][0] = "2A";
		x[2][1] = "2B";
		x[2][2] = "2C";
		x[2][3] = "2D";
		x[2][4] = "2E";
		
		System.out.println(x[0][2]);
		System.out.println(x[1][3]);
		System.out.println(x[2][2]);
		
		System.out.println(x[0][0]+x[1][1]+x[2][2]);
		
		for(int row =0; row<x.length; row++) {
			for(int col =0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}
		
	
		

	}

}
