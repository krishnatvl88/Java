import java.util.Scanner;

public class StrPlaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		 String palindrome = in.nextLine();
		 if(isPalindrome(palindrome)){
			 System.out.println("String is Palindrome");
		 }else{
			 System.out.println("String is not a plaindrome");
		 }
		/*String s = "bold";
		char[] c = s.toCharArray();
		//System.out.println(c[0]);
		String check = "";
		int len = c.length;
		//System.out.println(len);
		for(int i=len-1;i>=0;i--){
			//check = c(i);
		//	System.out.println(ch);
			check = check+c[i];
		}
		
		System.out.println(check);
		*/
		//System.out.println(s);
	}
	
	public static boolean isPalindrome(String str) {    
	    int n = str.length();
	    for( int i = 0; i < n/2; i++ )
	        if (str.charAt(i) != str.charAt(n-i-1)) return false;
	    return true;    
	}

}
