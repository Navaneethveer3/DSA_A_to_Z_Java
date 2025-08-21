import java.util.*;

public class bucket_sort_integers {

	public static void main(String[] args) {
		int[] nums = {10,12,11,39,26,42,33,58,92,66,333,111,999,777};
		int small = (int)1e9;
		int large = 0;
		for(int i : nums) {
			small = Math.min(small, i);
			large = Math.max(large, i);
		}
		
		// Find LCM(small,large);
		int lcm = (small*large)/gcd(small,large);
		if(lcm==0) lcm = (small*large);
		
		// Create buckets of size LCM;
		LinkedList<Integer>[] buckets = new LinkedList[lcm+1];
		for(int i=0;i<lcm+1;i++) {
			buckets[i] = new LinkedList<>();
		}
		for(int i : nums) {
			
			// Store at the relevant index bucket but dividing the value with LCM;
			int ind = (int)Math.round(i/lcm);
			buckets[ind].add(i);
		}
		for(int i=0;i<lcm+1;i++) {
			
			// Sort each buckets if the size of the bucket is size>1;
			if(buckets[i].size()>1) {
				Collections.sort(buckets[i]);
			}
		}
		int ind = 0;
		
		// Copy back the sorted bucket values to original array;
		for(int i=0;i<lcm+1;i++) {
			if(buckets[i].size()!=0) {
				for(int j : buckets[i]) {
					nums[ind++] = j;
				}
			}
		}
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}
	static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
}
