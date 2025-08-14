import java.util.*;

public class basics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		//Print from 1 to n
		printUptoN(n);
		System.out.println();
		//Print from n to 1
		printFromN(n);
	}
	static void printUptoN(int n) {
		if(n==0) return;
		printUptoN(n-1);
		System.out.print(n+" ");
	}
	static void printFromN(int n) {
		if(n==0) return;
		System.out.print(n+" ");
		printFromN(n-1);
	}
}
