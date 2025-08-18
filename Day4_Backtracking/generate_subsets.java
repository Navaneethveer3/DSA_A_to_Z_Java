import java.util.*;

public class generate_subsets {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> subsets = new ArrayList<>();
		generate(subsets,new ArrayList<>(),arr,0);
		for(int i=0;i<subsets.size();i++) {
			System.out.println(subsets.get(i));
		}
	}
	static void generate(List<List<Integer>> subsets, List<Integer> sub, int[] arr, int i) {
		if(i>=arr.length) {
			subsets.add(new ArrayList<>(sub));
			return;
		}
		sub.add(arr[i]);
		generate(subsets,sub,arr,i+1);
		sub.remove(sub.size()-1);
		generate(subsets,sub,arr,i+1);
	}
}
