public class reverse_pairs {

	public static void main(String[] args) {
		int[] nums = {1,5,2,3,1}; // output : 3;
		System.out.println("The number of pairs that exists is : "+reversePairs(nums,0,nums.length-1));
	}
	static int reversePairs(int[] nums, int low, int high) {
		if(low>=high) return 0;
		int count = 0;
		int mid = (low+high)/2;
		count += reversePairs(nums,low,mid);
		count += reversePairs(nums,mid+1,high);
		count += countPairs(nums,low,mid,high);
		merge(nums,low,mid,high);
		return count;
	}
	// Right elements that satisfies the given condition;
	static int countPairs(int[] nums, int low, int mid, int high) {
		int count = 0;
		int j = mid+1;
		for(int i=low;i<=mid;i++) {
			while(j<=high && nums[i]>2*nums[j]) j++;
			count += j-(mid+1);
		}
		return count;
	}
	static void merge(int[] nums, int low, int mid, int high) {
		int[] lSub = new int[(mid-low)+1];
		int[] rSub = new int[high-mid];
		int n1 = lSub.length;
		int n2 = rSub.length;
		int i = low;
		int j = mid+1;
		for(int k=0;k<n1;k++) {
			lSub[k] = nums[k+i];
		}
		for(int k=0;k<n2;k++) {
			rSub[k] = nums[k+j];
		}
		i = 0;
		j = 0;
		int k = low;
		while(i<n1 && j<n2) {
			if(lSub[i]<rSub[j]) {
				nums[k++] = lSub[i++];
			}
			else {
				nums[k++] = rSub[j++];
			}
		}
		while(i<n1) {
			nums[k++] = lSub[i++];
		}
		while(j<n2) {
			nums[k++] = rSub[j++];
		}
	}
}
