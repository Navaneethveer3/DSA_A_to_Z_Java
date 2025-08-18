import java.util.*;

public class subsets_sum_equals_to_k {

	public static void main(String[] args) {
		int[] arr = {2,3,5,6,7};
		int k = 9;
		List<List<Integer>> subsets = new ArrayList<>();
		findSubsets(subsets,new ArrayList<>(),arr,0,k,0);
		for(int i=0;i<subsets.size();i++) {
			for(int val : subsets.get(i)) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
	static void findSubsets(List<List<Integer>> subsets, List<Integer> sub, int[] arr, int sum, int k, int i) {
		if(sum==k) {
			subsets.add(new ArrayList<>(sub));
			return;
		}
		if(i>=arr.length || sum>k) {
			return;
		}
		sub.add(arr[i]);
		findSubsets(subsets, sub, arr, sum+arr[i], k, i);
		sub.remove(sub.size()-1);
		findSubsets(subsets,sub,arr,sum,k,i+1);
	}
}
