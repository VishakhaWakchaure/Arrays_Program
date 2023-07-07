package Arrays;

public class LargestElement {
public static int isLargestNumber(int arr[]) {
	int largest=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(largest<arr[i]) {
			largest=arr[i];
		}
	}
	return largest;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {22,56,77,88,999,123};
System.out.println(isLargestNumber(a));
	}

}
