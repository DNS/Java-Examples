
public class loop {
	public static void main (String[] args) {
		for (int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		for (int i=5; i>0; i--) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		int[] x = {111, 222, 444};
		for (int i: x) {
			System.out.println(i);
		}
		
	}
}

