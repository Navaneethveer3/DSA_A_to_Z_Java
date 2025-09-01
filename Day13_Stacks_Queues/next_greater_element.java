import java.util.*;

public class nge {

	public static void main(String[] args) {
		int[] arr = {2,1,0,4,5,2,3};
		int n = arr.length;
		int[] nge = new int[n];
		Stack<Integer> stk= new Stack<>();
		for(int i=n-1;i>=0;i--) {
			while(!stk.isEmpty() && stk.peek()<arr[i]) {
				stk.pop();
			}
			nge[i] = stk.isEmpty()?-1:stk.peek();
			stk.push(arr[i]);
		}
		for(int i : nge) {
			System.out.print(i+" ");
		}
	}

}
