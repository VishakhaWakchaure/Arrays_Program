package Arrays;

public class Reverse {

public static int[] isReverse(int a[]) {
	int b[]=new int [a.length];
	int k=0;
	for(int i=a.length-1;i>=0;i--) {
		b[k++]=a[i];
	}
	return b;
	
}
public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,9,9};
	int a[]=isReverse(arr);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+ " ");
	}

	}

}
