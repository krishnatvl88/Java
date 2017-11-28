import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a String in Lowercase : ");
        s1 = scan.nextLine();
        System.out.println(s1.length());
        for(int i=0;i<s1.length();i++){
        	//System.out.println();
        	ch = s1.charAt(i);
        	temp = (int) ch;
            temp = temp + 32;
            ch = (char) temp;
            
            System.out.println("Upper case is " + ch);
        }
	}

}
