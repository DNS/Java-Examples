import java.util.HashMap;

public class variables {
	public static void main (String[] args) {
		System.out.println("--------");
		
		// VARIABLES: Integer, String
		int x = 123;
		String s = "Hello World";		
		System.out.println(x);
		System.out.println(s);
		
		System.out.println("--------");
		
		// ARRAY
		int[] arr = {11, 22, 33};
		System.out.println("array size: " + arr.length);
		for (int i: arr) {
			System.out.println(i);
		}
		
		System.out.println("--------");
		
		// HASH
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("one", 1);
		hm.put("two", 2);
		for (HashMap.Entry<String, Integer> i: hm.entrySet()) {
			System.out.println(i.getKey() + ": " + i.getValue());
		}
		
		System.out.println("--------");
		
		
	}	
}



