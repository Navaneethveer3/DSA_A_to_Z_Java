import java.util.*;

public class isPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.printf("The %s is %s ",str,palindromeCheck(str,0,str.length()-1));
	}
	static String palindromeCheck(String str, int l, int r) {
		if(l>=r) return "a Palindrome";
		if(str.charAt(l)!=str.charAt(r)) return "not a Palindrome";
		return palindromeCheck(str,l+1,r-1);
	}
}
