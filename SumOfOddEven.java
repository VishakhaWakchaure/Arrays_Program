package Arrays;

public class SumOfOddEven {
public static void isOddEven(int arr[]) {
	int evensum=0;
	int oddsum=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			evensum=evensum+arr[i];
		}else {
			oddsum=oddsum+arr[i];
		}
	}
	System.out.println(evensum);
	System.out.println(oddsum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {11,45,67,89,98,76,45,66};
isOddEven(a);
	}

}
