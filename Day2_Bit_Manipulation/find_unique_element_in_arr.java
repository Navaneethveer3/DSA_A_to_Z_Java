import java.util.*;

public class problems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		//Find unique value in an array;
		int[] arr = {1,2,2,4,1,7,8,4,8,1};
		int unique = arr[0];
		for(int i : arr) {
			unique ^= i;
		}
		System.out.println("The unique value in the array is : "+unique);
	}

}
