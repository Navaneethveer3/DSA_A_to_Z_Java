import java.util.*;

public class permutations_without_duplicates {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		Arrays.sort(nums);
		boolean[] vis = new boolean[nums.length];
		List<List<Integer>> permutations = new ArrayList<>();
		generate(permutations,new ArrayList<>(),vis,nums);
		for(int i=0;i<permutations.size();i++) {
			System.out.println(permutations.get(i));
		}
	}
	static void generate(List<List<Integer>> permu, List<Integer> list, boolean[] vis, int[] nums) {
		if(list.size()==nums.length) {
			permu.add(new ArrayList<>(list));
			return;
		}
		for(int j=0;j<nums.length;j++) {
			if(vis[j] || (j>0 && nums[j]==nums[j-1] && vis[j-1])) continue;
			list.add(nums[j]);
			vis[j] = true;
			generate(permu,list,vis,nums);
			list.remove(list.size()-1);
			vis[j] = false;
		}
	}
}
