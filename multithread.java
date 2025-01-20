
// Define a class that extends Thread
class MyThread extends Thread {
	private String threadName;

	public MyThread(String threadName) {
		this.threadName = threadName;
	}

	// Override the run method
	@Override
	public void run () {
		for (int i = 1; i <= 10; i++) {
			System.out.println(threadName + ": " + i);
			try {
				// Sleep for 1 second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(threadName + " interrupted.");
			}
		}
	}
}

public class multithread {
	public static void main (String[] args) {
		// Create two threads
		MyThread thread1 = new MyThread("Thread-1");
		MyThread thread2 = new MyThread("Thread-2");

		// Start the threads
		thread1.start();
		thread2.start();
	}
}

