
public class Blankreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String before_replace = "welcome man";
		System.out.println(before_replace);
		int len = before_replace.length();
		String after_replace = before_replace.replace(" ", "");
		System.out.println(after_replace);
		StringBuilder s = new StringBuilder(after_replace);
		System.out.println(s.insert(7, len));
		
	}

}
