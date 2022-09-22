package basic;

public class Power {

	public static void main(String[] args) {
		
		int x = 2, y = 2;
		int r = 1;
		
		while(y!= 0) {
			r = r*x;
			y--;
		}
		
		System.out.println("Output = " + r);

	}

}
