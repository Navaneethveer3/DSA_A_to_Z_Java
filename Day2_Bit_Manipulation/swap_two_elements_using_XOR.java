import java.util.*;

public class problems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		//Swap two numbers using XOR;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.printf("The swappped values of a : %d and b : %d\n",a,b);
	}

}
