import java.util.*;

public class basics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printUptoN(n,1);
		System.out.println();
		printFromN(n);
	}
	static void printUptoN(int n, int i) {
		if(i==n+1) return;
		System.out.print(i+" ");
		printUptoN(n,i+1);
	}
	static void printFromN(int n) {
		if(n==0) return;
		System.out.print(n+" ");
		printFromN(n-1);
	}
}
