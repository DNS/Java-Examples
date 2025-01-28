import java.util.*;

public class variables {
	public static void main (String[] args) {
		System.out.println("--------");
		
		// VARIABLES: Integer, String
		// java doesn't support unsigned value
		byte a1 = 8;
		short a2 = 32767;
		int a3 = 2147483647;
		long a4 = 9223372036854775807L;
		float a5  = 0.123456789f;
		double a6 = 0.1234567890123456;
		boolean a7 = true;
		char a8 = 'Z';
		String s = "Hello World";
		System.out.println(a8);
		System.out.println(s);
		
		System.out.println("--------");
		
		// ARRAY
		int[] arr = {11, 22, 33};
		System.out.println("array size: " + arr.length);
		for (int i: arr)
			System.out.println(i);
		
		System.out.println("--------");
		
		// LIST
		List<String> li  = List.of("C","D");
		for (String buf: li)
			System.out.println(buf);
		
		System.out.println("--------");
		
		// ARRAYLIST
		List<String> al  = new ArrayList<>();
		al.add("A");
		al.add("B");
		for (String buf: al)
			System.out.println(buf);
				
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



