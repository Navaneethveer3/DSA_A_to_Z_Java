import java.util.*;

public class left_rotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k = sc.nextInt();
		sc.close();
		int n = str.length();
		k = k%n;
		char[] arr = str.toCharArray();
		
		//Left Rotation;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		str = new String(arr);
		System.out.println("Left Rotated String is : "+str);
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
