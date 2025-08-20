public class sort_colors {

	public static void main(String[] args) {
		int[] nums = {1,2,1,0,2,0,1,1,2,0,1,0,2,2};
		int l = 0;
		int r = nums.length-1;
		int i=0;
		while(i<=r) {
			if(nums[i]==0) {
				swap(nums,i,l);
				l++;
			}
			else if(nums[i]==1) {
				i++;
			}
			else {
				swap(nums,i,r);
				r--;
			}
		}
		for(int val : nums) {
			System.out.print(val+" ");
		}
	}
	static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
