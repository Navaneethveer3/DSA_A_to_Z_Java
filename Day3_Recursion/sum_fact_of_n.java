import java.util.*;

public class sum_fact_of_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("The sum upto n : "+sumOfN(n));
		System.out.println("The factorial of n : "+factOfN(n));
		
	}
	static int sumOfN(int n) {
		if(n==1) return 1;
		return n+sumOfN(n-1);
	}
	static int factOfN(int n) {
		if(n==1) return 1;
		return n*factOfN(n-1);
	}
}
