package Arrays;
//write java program to find the second largest numbaer
public class SecondLargestElement {

	public static void main(String[] args) {
		
		int a[] ={3,25,45,34,56,100,90};
		int temp=returnLargeNumber(a);
		System.out.println(temp);
			}
		public static int returnLargeNumber(int arr[]) {
			int large=arr[6];
			for( int i=0;i<arr.length;i++){
				if(arr[i]>large) {
					large=arr[6];
					
				}
			}
			return large;
	}
	

	}


