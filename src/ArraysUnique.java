import java.util.ArrayList;
import java.util.List;

public class ArraysUnique {
	public static void main(String args[]) {
		 int[] Array1 = new int[] {1,65,5,15,38,4,13};
		    int[] Array2 = new int[] {2,48,9,55,-58,1,10,4};
		    boolean contains = false;
		    List<Integer> unique = new ArrayList<Integer>();
		    List<Integer> dup = new ArrayList<Integer>();

		    for(int i=0; i<Array1.length; i++) {
		        for(int j=0; j<Array2.length; j++) {
		            if(Array1[i]==Array2[j]) {
		                contains = true;
		                dup.add(Array1[i]);
		                break;
		            }
		        }
		        if(!contains) {
		            unique.add(Array1[i]);
		        }
		        else{
		            contains = false;
		        }
		    }
		    
		    for(int j=0; j<Array2.length; j++) {
		        for(int i=0; i<Array1.length; i++) {
		            if(Array2[j]==Array1[i]) {
		                contains = true;
		               //.add(Array2[j]);
		                break;
		            }
		        }
		        if(!contains) {
		            unique.add(Array2[j]);
		        }
		        else{
		            contains = false;
		        }
		    }
		    System.out.println("Duplicates are: "+dup);
	        System.out.println("Unique elements in the order from 2 arrays: "+unique);
		   
	}
	 
/*	 public static void main(String a[]){
         
	        
	      MyDisticntElements.countUnique(arr1,arr2);
	     //   MyDisticntElements.checkUnique(nums);
	    }
	    */
}
