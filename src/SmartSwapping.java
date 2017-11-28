public class SmartSwapping {
 
	public static void main(String args[]) {
		
		int numX = 60;
		int numY = 20;
		System.out.println("Pre-swapping state:");
		System.out.println("numX value: " + numX);
		System.out.println("numY value: " + numY);
		
		System.out.println("");
		
		numX = numX + numY;
		System.out.println("1st ADD ---- "+numX);
		numY = numX - numY;
		System.out.println("2nd SUB ---- "+numY);
		numX = numX - numY;
		System.out.println("3rd SUB ---- "+numX);
		System.out.println("Post-swapping state:");
		System.out.println("numX value: " + numX);
		System.out.println("numY value: " + numY);
	}
}