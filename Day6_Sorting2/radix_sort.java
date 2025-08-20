import java.util.*;

public class radix_sort {

	public static void main(String[] args) {
		int[] nums = {802, 2, 24, 45, 66, 170, 75, 90};
		int large = 0;
		for(int i : nums) {
			if(i>large) large = i;
		}
		
		// Tc : O(d * (10+10)) ~ O(n) , where d is the count of largest digit;
		int loopCount = digitCount(large);
		
		// Loop runs until the digit count of the largest number;
		for(int i=0;i<loopCount;i++) {
			ArrayList<Integer>[] count = new ArrayList[10];
			for(int j=0;j<10;j++) {
				count[j] = new ArrayList<>();
			}
			for(int j=0;j<nums.length;j++) {
				int digit = findDigit(nums[j],i);
				count[digit].add(nums[j]);
			}
			int ind = 0;
			
			// The values are sorted based on the digit like 1's, 10's, etc.....;
			for(int j=0;j<count.length;j++) {
				if(count[j].size()>0) {
					for(int k : count[j]) {
						nums[ind++] = k;
					}
				}
			}
		}
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}
	static int digitCount(int n) {
		int count = 0;
		if(n<=9) return 1;
		while(n>0) {
			count++;
			n /= 10;
		}
		return count;
	}
	static int findDigit(int n, int i) {
		if(i==0) return n%10;
		int ind = 0;
		while(ind<i && n>0) {
			n /= 10;
			ind++;
		}
		return n%10;
	}
}
