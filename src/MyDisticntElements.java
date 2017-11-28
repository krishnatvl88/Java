import java.util.HashSet;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class MyDisticntElements {
 
	public static void countUnique(int[] array) {
	    int length = array.length;
	    int count = 0,flag=0;
	    for (int i = 0; i < length; i++) {
	    	for(int j=0;j<length;j++){
	    		if(i!=j){
	    			if(array[i]!=array[j]){
	    				flag=1;
	    			}else{
	    				flag=0;
	    				break;
	    			}
	    		}	
	    	}
	    	if(flag==1){
	    		count++;
	    		System.out.println(array[i]+" ");
	    	}
	    }
	    //System.out.println(count);
	}
	
	public static void checkUnique(int[] arr){
		Set<Integer> st = new HashSet<Integer>();
		for(Integer chk: arr){
			st.add(chk);
				System.out.println(chk);
			
		}
	}
	
	
    public static void main(String a[]){
         
        int[] nums = {1,2,7,2,4,7,8,1};
      MyDisticntElements.countUnique(nums);
     //   MyDisticntElements.checkUnique(nums);
    }
}