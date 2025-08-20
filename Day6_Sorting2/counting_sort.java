public class counting_sort {

	public static void main(String[] args) {
		int[] nums = {4,1,0,1,2,3,4,4,1,2};
		int len = 0;
		for(int i : nums) {
			if(len<i) len = i;
		}
    
    // Count frequency of all the values;
		int[] count = new int[len+1];
		for(int i : nums) {
			count[i] += 1;
		}
		int ind = 0;
    
    // Copy the values to the array until the counter becomes 0 for the particular values;
		for(int i=0;i<count.length;i++) {
			while(count[i]!=0) {
				nums[ind++] = i;
				count[i] -= 1;
			}
		}
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}

}
