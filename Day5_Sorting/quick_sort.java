public class quick_sort {

	public static void main(String[] args) {
		int[] nums = {18,25,17,5,92};
		quicksort(nums,0,nums.length-1);
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}
	static void quicksort(int[] nums, int l, int h) {
		if(l<h) {
			int pivot = partition(nums,l,h);
			quicksort(nums,l,pivot-1);
			quicksort(nums,pivot+1,h);
		}
	}
	static int partition(int[] nums, int l, int h) {
		int i = l-1;
		int pivot = h;
		for(int j=l;j<=h;j++) {
			if(nums[j]<nums[pivot]) {
				i++;
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
		}
		i++;
		int temp = nums[pivot];
		nums[pivot] = nums[i];
		nums[i] = temp;
		return i;
	}
}
