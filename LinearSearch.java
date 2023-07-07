package Arrays;
//Q write a java program find the length of array element 
public class LinearSearch {
public static int searchElement(int a[],int n) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==n) {
			return i+1;
		}
	}
	return n;
	
}
	public static void main(String[] args) {
		
int a[]= {3,1,5,2,2,5,4};
int p=searchElement(a, 5);     //position 
System.out.println("index of is"+p);
	}

}
