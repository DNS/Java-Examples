
public class sortbubble {
	static void bubble_sort (int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
			}
		}
	}
		
	public static void main (String[] args) {
		int[] arr = {4,-3,9,-5,2};
		bubble_sort(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}


