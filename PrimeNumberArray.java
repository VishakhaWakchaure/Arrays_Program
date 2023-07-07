package Arrays;

public class PrimeNumberArray {
public static int isPrimeNumber(int arr[],int n){
	for(int i=0;i<n;i++) {
		int count=1;
		for(int j=0;j<arr.length;j++) {
			if(i%j==0) {
			count++;
			}
		}
		if(count==2) {
			System.out.println("prime"+arr[i]);
		}else {
			System.out.println("non prime"+arr[i]);
		}
	}
	return 0;
	
}
public static void main(String[] args) {
	 int a[]= {2,4,5,6,7,8,9};
	int b= isPrimeNumber(a,9);
	 System.out.print(b);
}
}
