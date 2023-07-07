package Arrays;

public class PairSum {
public static int isSumPair(int arr[],int sum) {
	int count=0;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]+arr[j]==sum) {
			System.out.println("("+arr[i]+","+arr[j]+")");
			count++;
		}
	}
}
	if(count>0) {
		return count;
	}else {
		return 0;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,6,2,5,4,3,2,4};
System.out.println(isSumPair(arr, 7));
	}

}
