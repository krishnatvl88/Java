import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class ArrayDuplicate {
 
	public static void countDuplicate(int[] arr,int size) {
	        int i, j, count=0;
	        System.out.println("Repeated Elements are :");
	        for (i = 0; i < size; i++) 
	        {
	            for (j = i+1; j < size; j++) 
	            {
		                if ((arr[i] == arr[j]) && (i!=j)){ 
		                    System.out.print(arr[i] + " ");
		                    count++;
		                }    
	            }
	            
	        }
	      //  System.out.println(count);
	}
	
	public static void checkDuplicate(int[] arr){
		Set<Integer> st = new HashSet<Integer>();
		for(Integer chk: arr){
			if(st.add(chk)==false){
				System.out.println(chk);
			}
		}
	}
	
	public static Set<Integer> findDuplicates(int[] input) { 
    	Set<Integer> duplicates = new HashSet<Integer>(); 
    	for (int i = 0; i < input.length; i++) { 
    		for (int j = 1; j < input.length; j++) { 
    			if (input[i] == input[j] && i != j) { 
    				// duplicate element found 
    				duplicates.add(input[i]); 
    				break; 
    			} 
    		} 
    	} 
    		return duplicates; 
    }
	
    public static void main(String a[]){
    	ArrayDuplicate repeat = new ArrayDuplicate();
        int arr[] = {1, 2, 7, 2, 4, 7, 8, 1};
        int arr_size = arr.length;
        //.sort(arr);
      //repeat.findDuplicates(arr);
       // ArrayDuplicate.checkDuplicate(arr);
        ArrayDuplicate.findDuplicates(arr);
    }
}