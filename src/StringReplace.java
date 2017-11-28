import org.omg.Messaging.SyncScopeHelper;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words = "welcome to maventic";
		char from = 'a';
		char to = '@';
		
		String ab = replace(words, from, to);
		System.out.println(ab);
		String ac = insertCharAt(ab, '#', 2);
		System.out.println(ac);
	}
	public static String replace(String s, char from, char to){
		    if (s.length() < 1) {
		      return s;
		    }
		    else {
		      char first = from == s.charAt(0) ? to : s.charAt(0);
		      return first + replace(s.substring(1), from, to);
		    }
	}
	
	public static String insertCharAt(String a, char ch, int index){
        //1 Exception if st == null
        //2 Exception if index<0 || index>st.length()

        if (a == null){
            throw new NullPointerException("Null string!");
        }

        if (index < 0 || index > a.length())
        {
            throw new IndexOutOfBoundsException("Try to insert at negative location or outside of string");
        }
        return a.substring(0, index)+ch+a.substring(index, a.length());
    }
}
