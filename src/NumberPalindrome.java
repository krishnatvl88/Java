import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 int palindrome = in.nextInt();
		 if(isPalindrome(palindrome)){
			 System.out.println("Num is palindrome");
		 }else{
			 System.out.println("Num is not palindrome");
		 }
		
	}
	
	public static boolean isPalindrome(int num){
		int reverse = 0;
		int palindrome = num;
		while(palindrome!=0){
			//int remain = ;
			reverse = (reverse * 10) + (palindrome%10);
			palindrome = palindrome/10;
		}
		
		if(num==reverse){
			return true;
		}else{
			return false;
		}
	}

}
