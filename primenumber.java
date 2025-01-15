
public class primenumber {
	static Boolean prime_check (int x) {
		for (int i=x-1; i>=2; i--) {
			if (x % i == 0) {
				System.out.println(x + " is not prime number!");
				return false;
			}
		}
		
		
		System.out.println(x + " is prime number!");
		return true;
	}
	
	public static void main (String[] args) {
		prime_check(5);
		prime_check(6);
		prime_check(7);
	}
	
	
}
