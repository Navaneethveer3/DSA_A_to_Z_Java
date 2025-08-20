import java.util.*;

public class bucket_sort {

	public static void main(String[] args) {
		double[] nums = {0.35,0.32,0.25,0.28,0.22};
		int n = nums.length;
		
		// Create LinkedList buckets to store values in the relevant indexes;
		LinkedList<Double>[] buckets = new LinkedList[n];
		for(int i=0;i<n;i++) {
			buckets[i] = new LinkedList<>();
		}
		for(int i=0;i<n;i++) {
			int ind = (int)Math.round(nums[i]*10);
			buckets[ind].add(nums[i]);
		}
		for(int i=0;i<n;i++) {
			if(!buckets[i].isEmpty()) {
				
				// Sort the LinkedLists of each index;
				Collections.sort(buckets[i]);
			}
		}
		int ind = 0;
		
		// Store back into the array;
		for(int i=0;i<n;i++) {
			if(!buckets[i].isEmpty()) {
				for(double j : buckets[i]) {
					nums[ind++] = j;
				}
			}
		}
		for(double i : nums) {
			System.out.print(i+"  ");
		}
	}

}
