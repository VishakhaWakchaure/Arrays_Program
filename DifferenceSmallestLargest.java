package Arrays;

public class DifferenceSmallestLargest {
	public static void isDiffernceSmallLargest(int arr[]) {
		int max_no=arr[0]; 
		int min_no=arr[0];
		for(int  i=0;i<arr.length;i++) {
			if(max_no<arr[i]) {
				 max_no=max_no+arr[i];
			
		}else if(min_no>arr[i]) {
			min_no=min_no+arr[i];
		}
			}
		System.out.println("Difference is "+(max_no-min_no));
		
		}
		
public static void main(String[] args) {
	int a[]= {2,3,4,5};
	isDiffernceSmallLargest(a);
}
}
