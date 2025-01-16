public class exception2 {
	public static void main (String[] args) {
		try {
			System.out.println("Try!");
			int x = 123;
		} catch (Exception e) {
			System.err.println("Error!");
		} finally {
			System.out.println("Finally!");
		}
		
	}
	
}