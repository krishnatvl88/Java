
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome";
		char[] ch = new char[s.length()];
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}

}
