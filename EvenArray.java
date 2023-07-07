package Arrays;

public class EvenArray {
public static int isEvenArray(int arr[]) {
	int evencount=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			evencount++;
		}
	}
	return evencount;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {38,56,78,89,11,34};
System.out.println(isEvenArray(a));
	}

}
