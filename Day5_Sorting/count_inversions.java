import java.util.*;

public class count_inversions {

	public static void main(String[] args) {
		int[] nums = {12,14,9,8,5};
		System.out.println("The number of inversions the array contains is : "+countInversions(nums,0,nums.length-1));
	}
	static int countInversions(int[] nums,  int l, int r) {
		if(l>=r) return 0;
		int count = 0;
		int mid = (l+r)/2;
		count += countInversions(nums,l,mid);
		count += countInversions(nums,mid+1,r);
		count += merge(nums,l,mid,r);
		return count;
	}
	static int merge(int[] nums, int l, int m, int r) {
		int i = l;
		int j = m+1;
		List<Integer> list = new ArrayList<>();
		int count = 0;
		
		// We keep on sorting and keep the left part greater so that we can compare with the right smaller values;
		while(i<=m && j<=r) {
			if(nums[i]<=nums[j]) {
				list.add(nums[i++]);
			}
			else {
				list.add(nums[j++]);
				count += (m-l+1);
			}
		}
		while(i<=m) {
			list.add(nums[i++]);
		}
		while(j<=r) {
			list.add(nums[j++]);
		}
		for(int k=l;k<=r;k++) {
			nums[k] = list.get(k-l);
		}
		return count;
	}
}
