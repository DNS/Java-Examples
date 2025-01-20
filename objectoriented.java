
// Define the Car class
class ObjectTest {
    public int X;
    private int Y;

    // Constructor
    public ObjectTest (int X, int Y) {
        this.X = X;
        this.Y = Y;
    }


    public int get_Y () {
        return this.Y;
    }

    public void set_Y (int value) {
        this.Y = value;
    }
}




public class objectoriented {
    public static void main (String[] args) {
        ObjectTest oo = new ObjectTest(100, 200);
		
		oo.X = 888;
		// oo.Y = 777;	// error: Y has private access
		oo.set_Y(500);
		
        System.out.println("X: " + oo.X);
        System.out.println("Y: " + oo.get_Y());
		
		

    }
}


