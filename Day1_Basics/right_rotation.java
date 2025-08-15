import java.util.*;

public class right_rotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k = sc.nextInt();
		sc.close();
		int n = str.length();
		k = k%n;
		char[] arr = str.toCharArray();
		
		//Right Rotation;
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
		str = new String(arr);
		System.out.println("Right Rotated String is : "+str);
	}
	static void reverse(char[] arr, int i , int j) {
		while(i<=j) {
			char c = arr[i];
			arr[i] = arr[j];
			arr[j] = c;
			i++;
			j--;
		}
	}

}
