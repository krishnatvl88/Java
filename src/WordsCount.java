
public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Doctor Alliance";
		int count = 1;
		for(int i=0;i<str.length()-1;i++){
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println(count);
	}

}
