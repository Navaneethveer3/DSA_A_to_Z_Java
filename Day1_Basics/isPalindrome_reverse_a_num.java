import java.util.*;

public class palindrome_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reversed = 0;
		
		//Same logic for checking for a Palindrome or not and reversing a number;
		while(temp>0) {
			reversed = (reversed*10)+(temp%10);
			temp /= 10;
		}
		System.out.println((n==reversed)?"It is a Palindrome":"It is not a Palindrome");
		sc.close();
	}

}
