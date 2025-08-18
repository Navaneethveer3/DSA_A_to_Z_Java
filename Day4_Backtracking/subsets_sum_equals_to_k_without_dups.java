import java.util.*;

public class subsets_sum_without_duplicates {

	public static void main(String[] args) {
		int[] arr = {2,3,5,6,7,3,2,7};
		int k = 9;
		Arrays.sort(arr);
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
		for(int j=i;j<arr.length;j++) {
			if(j>0 && arr[j]==arr[j-1]) continue;
			sub.add(arr[j]);
			findSubsets(subsets,sub,arr,sum+arr[j],k,i);
			sub.remove(sub.size()-1);
		}
	}

}
