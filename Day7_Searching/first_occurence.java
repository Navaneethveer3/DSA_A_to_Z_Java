public class first_occurence {

	public static void main(String[] args) {
		int[] nums = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
		int x = 3;
		int low = 0;
		int high = nums.length-1;
		int ind = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]==x) {
				ind = mid;
				high = mid-1;
			}
			else if(nums[mid]<x) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		System.out.printf("The first occurence of %d is %d",x,ind);
	}

}
