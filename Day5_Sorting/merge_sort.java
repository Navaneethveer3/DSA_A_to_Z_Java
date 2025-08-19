public class merge_sort {

	public static void main(String[] args) {
		int[] nums = {2,5,4,7,1,3,6};
		mergeSort(nums,0,nums.length-1);
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}
	static void mergeSort(int[] nums, int l, int r) {
		if(l>=r) return;
		int m = (l+r)/2;
		mergeSort(nums,l,m);
		mergeSort(nums,m+1,r);
		merge(nums,l,m,r);
	}
	static void merge(int[] nums, int l, int m , int r) {
		if(l>r) return;
		int[] lSub = new int[(m-l)+1];
		int[] rSub = new int[r-m];
		int n1 = lSub.length;
		int n2 = rSub.length;
		int i = l;
		int j = m+1;
		for(int x=0;x<n1;x++) {
			lSub[x] = nums[i+x];
		}
		for(int x=0;x<n2;x++) {
			rSub[x] = nums[j+x];
		}
		i = 0;
		j = 0;
		int k = l;
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
