
public class TechApps {

	public static void main(String[] args) {
		
		/*---------To check prime number in given array---------------*/
		int num[]={1,3,4,7,8,9,10,12,11,15};
			for(int i=0;i<num.length;i++){
				boolean isPrime = true;
		        //check to see if the numbers are prime
		        for (int j=2; j<num[i]; j++){
		            if(num[i]%j==0){
		                isPrime = false;
		                break;
		            }
		        }
		        if(isPrime){
		        	System.out.println(num[i] + " are the prime numbers in the array ");
		        }
			}     
		
		/*----------------To print first 10 fibanocci numbers----------*/
	/*	int n1=0,n2 = 1,n3,count=10;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<count;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	*/
		
		/*--------------To check string is palindrome-------------*/
	/*	String str = "malayalam",reverse="";
		int len = str.length();
		for(int i=len-1;i>=0;i--){
			//System.out.println(str.charAt(i));
			reverse = reverse + str.charAt(i);
			if(str.equals(reverse)){
				System.out.println("Palindrome");
			}else{
				System.out.println("Not palindrome");
			}
		}
	*/	
	}
	
}
