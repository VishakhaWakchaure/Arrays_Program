package Arrays;

public class DifferenceEvenOdd {
	public static void isDifference(int arr[]) {
		int even_sum=arr[0];
		int odd_sum=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_sum=even_sum+arr[i];
			}else {
				odd_sum=odd_sum+arr[i];
			}
		}
		System.out.println("differnce is"+(even_sum-odd_sum));
	}
public static void main(String[] args) {
	int a[]= {2,2,1,1};
	isDifference(a);
}
}
