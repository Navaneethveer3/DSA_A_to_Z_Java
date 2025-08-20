public class counting_sort_Sc_optimized {

	public static void main(String[] args) {
		int[] nums = {26,22,20,28,35,30,29};
		int small = (int)1e9;
		int large = 0;
		for(int i : nums) {
			small = Math.min(small, i);
			large = Math.max(large,i);
		}
		int len = (large-small)+1;
		
		// Use an array within the given range rather than from 0;
		int[] count = new int[len];
		for(int i : nums) {
			count[i%small]++;
		}
		int ind = 0;
		for(int i=small;i<=large;i++) {
			while(count[i%small]!=0) {
				nums[ind++] = i;
				count[i%small]--;
			}
		}
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}

}
