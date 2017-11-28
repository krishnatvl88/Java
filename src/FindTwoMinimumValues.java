
public class FindTwoMinimumValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = {10, 3, -3, -15, -40, 0, 2};
	    int smallest = Integer.MAX_VALUE;
	    int secondSmallest = Integer.MAX_VALUE;
	    System.out.println(smallest);
	    System.out.println(secondSmallest);
	    for (int i = 0; i < elements.length; i++) {
	    if (elements[i] < smallest) {
	            secondSmallest = smallest;
	            smallest = elements[i];
	        } else if (elements[i] < secondSmallest) {
	            secondSmallest = elements[i];
	        }

	    }
	    System.out.println(smallest);
	    System.out.println(secondSmallest);
	}

}
