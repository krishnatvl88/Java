
public class FindInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to maventic";
		//len
		StringBuilder sb = new StringBuilder(s.length());
		//char[] ch=s.toCharArray();
		for (int index = 0; index < s.length(); index++) {
	        s.append(" ");
	    }
	    return sb.toString();
	}

}
