import java.util.Stack;

public class FineNearestSmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 6, 4, 10, 2, 5};
		//for(int i=0;i<numbers.length;i++){
		//	System.out.println(numbers[i]);
		//}
		
		Stack<Integer> s = new Stack<Integer>();
        int popped = 0;
       
        for(int i = 0; i < numbers.length; i++){                        
            while(!s.isEmpty() && s.peek() >= numbers[i]){                
                popped = s.pop();        
                //System.out.println(s.peek());
                //System.out.println(s.pop());
            }
            if(s.isEmpty())
                System.out.print("-1, ");               
            else
                System.out.print(s.peek() + ", ");
            s.push(numbers[i]);
        }
	}
}