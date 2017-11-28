import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = {100,90};
		
		myIntArray = new int[10];
		myIntArray[0] = 100;
		myIntArray[1] = 90;
		
		System.out.println("0 index:" +myIntArray[0]);
		System.out.println("1 index:" +myIntArray[1]);
		System.out.println("2 index:" +myIntArray[2]);
		
		String[] myStringArray = {"bmw","audi","benz"};
		System.out.println("0 index:" +myStringArray[0]);
		System.out.println("1 index:" +myStringArray[1]);
		System.out.println("2 index:" +myStringArray[2]);
		
		int len1 = myIntArray.length;
		int len2 = myStringArray.length;
		
		System.out.println("Int array length:" +len1);
		System.out.println("String array length:" +len2);
		
		for(int i=0; i<len1; i++){
			System.out.println(myIntArray[i]);
		}
		Arrays.sort(myIntArray);
		
		
	}

}
