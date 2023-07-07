package Arrays;
 //Q write a java program to find the unique element of an arrays
public class Uniqueelement {
public static int isUniqueNumber(int a[]) {
	int unique=a[0];
	for(int i=1;i<a.length;i++)
	    {
		unique=unique^a[i];	
			}
	return unique;
	
		}
	public static void main(String[] args) {
		int a[]= {2,2,3,3,4,4,7,5,5};
		System.out.println(isUniqueNumber(a));
	}
}

