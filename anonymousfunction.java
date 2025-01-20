

public class anonymousfunction {
	public static void main(String[] args) {
	
		Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous function!");
            }
        };
		
		runnable.run();
	}
}

