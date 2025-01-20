public class lambdafunction {
	
	// Define a functional interface
	interface MathOperation {
		int operation(int a, int b);
	}

	public static void main (String[] args) {
		// Create a lambda function that implements the MathOperation interface
        MathOperation addition = (a, b) -> a + b;

        // Use the lambda function
        System.out.println("Addition: " + addition.operation(5, 3));

        // Create another lambda function
        MathOperation subtraction = (a, b) -> a - b;
		
	}
	
}

