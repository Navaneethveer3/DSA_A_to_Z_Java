import java.util.*;

public class armstrong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String str = Integer.toString(n);
		int len = str.length();
		int sum = 0;
		for(int i=0;i<len;i++) {
			int num = str.charAt(i)-'0';
			sum += Math.pow(num, len);
		}
		System.out.println((sum==n)?"It is an Armstrong number":"It is not an Armstrong number");
	}

}
