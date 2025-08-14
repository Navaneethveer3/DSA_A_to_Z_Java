import java.util.*;

public class towerOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		findMoves(n,"First","Third","Second");
	}
	static void findMoves(int n, String f, String t, String s) {
		if(n==1) {
			System.out.printf("Move from tower %s to %s\n",f,t);
		}
		else {
			findMoves(n-1,f,s,t);
			findMoves(1,f,t,s);
			findMoves(n-1,s,t,f);
		}
	}
}
