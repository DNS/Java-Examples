public class formatoutput {
	
	public static void main (String[] args) {
		String s = "Hello World";
		int i = 123;
		float f = 4.1234567890123456789f;
		double d = 4.1234567890123456789;
		
		System.out.printf("%s\n%d\n%f\n%f\n", s, i, f, d);
		System.out.printf("%.20f\n%.20f\n", f, d);
		System.out.println("Welcome " + " Guest");
		
		
		String name = "John";
		int age = 30;
		
		// Using String.format()
		String formattedString1 = String.format("My name is %s and I am %d years old.", name, age);
		System.out.println(formattedString1);


		// Using StringBuilder (faster execution)
		StringBuilder sb = new StringBuilder();
		sb.append("My name is ").append(name).append(" and I am ").append(age).append(" years old.");
		String formattedString2 = sb.toString();
		System.out.println(formattedString2);
		
		
		
	}
	
}


