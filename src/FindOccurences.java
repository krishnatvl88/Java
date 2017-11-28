import java.util.Scanner;

public class FindOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		// String s2;
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter a string");
		 s1 = in.nextLine();
		 
		 System.out.println("Enter a character");
		 char c = in.next().charAt(0);
		 FindOccurences oc = new FindOccurences();
		 int occurence = oc.count(s1,c);
		 System.out.println(occurence);
		
		
	}
	
	public int count(String s, char c1){
		int cnt = 0;
		//String s = "Iam a married man";
		for(int i=0; i<s.length();i++){
			char ch = s.charAt(i);
			if(ch == c1){
				cnt++;
			}
		}
		return cnt;
	}
}
