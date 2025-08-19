public class kth_largest_in_an_array {

	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4}; // output : 5;
		int k = 2;
		// Quick Select algorithm provides Tc : O(n);
		System.out.println("The Kth largest in the given array is : "+findKthLargest(nums,k));
	}
	public static int findKthLargest(int[] nums, int k) {
        int index = nums.length-k;
        partition(nums,0,nums.length-1,index);
        return nums[index];
    }
    static void partition(int[] nums, int low, int high, int ind){
        if(low>=high) return;
        int i = low;
        int lp = low;
        int rp = high;
        int pivot = nums[high];
        while(i<=rp){
            if(nums[i]==pivot){
                i++;
            }
            else if(nums[i]<pivot){
                swap(nums,i,lp);
                i++;
                lp++;
            }
            else{
                swap(nums,i,rp);
                rp--;
            }
        }
        if(ind<lp){
            partition(nums,low,lp-1,ind);
        }
        else if(ind>rp){
            partition(nums,rp+1,high,ind);
        }
        else return;
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
