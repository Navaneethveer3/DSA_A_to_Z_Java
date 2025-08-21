public class binary_search {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int x = 3;
		int low = 0;
		int high = nums.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]==x) {
				System.out.printf("The value %d is present at index %d",x,mid);
				break;
			}
			else if(nums[mid]<x) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
	}

}
