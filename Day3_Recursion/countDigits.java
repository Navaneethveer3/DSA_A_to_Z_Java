import java.util.*;

public class countDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Count : "+count(n));
	}
	static int count(int n) {
		if(n<=0) {
			return 0;
		}
		return 1+count(n/10);
	}
}
