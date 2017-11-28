
public class FindDupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "w3schools"; int cnt=0;
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(ch[i]==ch[j]){
					System.out.println(ch[j]);
					cnt++;
					break;
				}
			}
		}
	}

}
