package Arrays;

public class RightRotate {
public static int[] isRightRotate(int a[],int n) {
	for(int i=0;i<n;i++) {
		int last=a[0];
		last=a[a.length-1];
		int j=0;
		for(j=a.length-1;j>0;j--) {
			a[j]=a[j-1];
		}
		a[0]=last;
	}
	return a;
	
}
public static void main(String[] args) {
	int a[]= {3,4,5,6,7,8,9};
	int arr[]=isRightRotate(a, 4);
	
	for( int n:arr) {
		System.out.print(n+" ");
	}
}
}
