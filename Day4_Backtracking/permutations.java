import java.util.*;

public class permutations {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> permutations = permute(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(permutations.get(i));
		}
	}
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permute = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        generate(permute,new ArrayList<>(),nums,vis);
        return permute;
    }
    static void generate(List<List<Integer>> permute, List<Integer> list, int[] nums, boolean[] vis){
        if(list.size()==nums.length){
            permute.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                list.add(nums[i]);
                vis[i] = true;
                generate(permute,list,nums,vis);
                list.remove(list.size()-1);
                vis[i] = false;
            }
        }
    }
}
