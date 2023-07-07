package Arrays;

public class OddArray {
public static int isOddNumber(int arr[]) {
	int oddcount=0;
	for(int i=0;i<arr.length;i++){
		if(!(arr[i]%2==0)) {
			oddcount++;
		}
	}
	return oddcount;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {67,78,55,76,9,3,65};
		System.out.println(isOddNumber(a));
	}

}
