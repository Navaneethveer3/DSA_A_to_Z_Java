public class three_way_partition {

	public static void main(String[] args) {
		int[] nums = {12,14,9,8,5,9,14,12};
		partition(nums,0,nums.length-1);
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}
  // Quick Select Algorithm;
	static void partition(int[] nums, int low, int high) {
		if(low>=high) return;
		int lp = low;
		int rp = high;
		int i = low;
		int pivot = nums[high];
		while(i<=rp) {
			if(nums[i]==pivot) {
				i++;
			}
			else if(nums[i]<pivot) {
				swap(nums,i,lp);
				lp++;
				i++;
			}
			else {
				swap(nums,i,rp);
				rp--;
			}
		}
		partition(nums,low,lp-1);
		partition(nums,rp+1,high);
	}
	static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
