import java.util.*;

public class add_1_to_end {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//Initially we have to add 1;
		int carry = 1;
		List<Integer> list = new ArrayList<>();
		for(int i=n-1;i>=0;i--) {
			int digit = arr[i]+carry;
			carry = digit/10;
			list.add(0,digit%10);
		}
		//If carry left, then add 1 at the start;
		if(carry==1) {
			list.add(0,1);
		}
		int[] res = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			res[i] = list.get(i);
		}
		for(int i : res) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
