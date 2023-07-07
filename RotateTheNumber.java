package Arrays;

public class RotateTheNumber {    //left rotate
	public static int[] isRotateNumber(int arr[],int n){
		for(int i=0;i<n;i++) {
			int frist=arr[0];
			int j=0;
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=frist;
			
		}
		return arr;
		
	}
public static void main(String[] args) {
	int a[]= {3,4,5,6,7,8,9};
	
	int arr[]=isRotateNumber(a,5);
	
	for(int n:arr) {
		System.out.print(n+" ");
	}
		
	
}
}
