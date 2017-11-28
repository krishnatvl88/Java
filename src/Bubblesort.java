
public class Bubblesort {

	public void bubblesort(int[] arr){
		int len = arr.length;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public void printarray(int[] arr){
		int l = arr.length;
		for(int i=0; i<l;i++){
			System.out.println(arr[i]+" ");
			//System.out.println();
		}
	}
	
	public static void main(String[] args) {
	int[] arr1 = {97,12,45,62,19,9};
	Bubblesort sort = new Bubblesort();
	sort.bubblesort(arr1);
	sort.printarray(arr1);
	}

}
