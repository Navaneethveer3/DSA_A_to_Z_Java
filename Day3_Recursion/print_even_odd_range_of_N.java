import java.util.*;

public class print_even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		//Print even from 1 to n;
		printFrom1Even(n);
		System.out.println();
		//Print even from n to 1;
		printFromNEven(n);
		System.out.println();
		//Print odd from 1 to n;
		printFrom1Odd(n);
		System.out.println();
		//Print odd from n to 1;
		printFromNOdd(n);
	}
	static void printFrom1Even(int n) {
		if(n==0) return;
		printFrom1Even(n-1);
		if((n&1)==0) System.out.print(n+" ");
	}
	static void printFromNEven(int n) {
		if(n==0) return;
		if((n&1)==0) System.out.print(n+" ");
		printFromNEven(n-1);
	}
	static void printFrom1Odd(int n) {
		if(n==0) return;
		printFrom1Odd(n-1);
		if((n&1)==1) System.out.print(n+" ");
	}
	static void printFromNOdd(int n) {
		if(n==0) return;
		if((n&1)==1) System.out.print(n+" ");
		printFromNOdd(n-1);
	}
}
