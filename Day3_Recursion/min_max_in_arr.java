public class min_max_in_arr {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] min = {Integer.MAX_VALUE};
		int[] max = {Integer.MIN_VALUE};
		findMinMax(arr,min,max,0);
		System.out.printf("Minimum : %d \nMaxmium : %d",min[0],max[0]);
	}
	static void findMinMax(int[] arr, int[] min, int[] max, int ind) {
		if(ind==arr.length) return;
		if(min[0]>arr[ind]) min[0] = arr[ind];
		if(max[0]<arr[ind]) max[0] = arr[ind];
		findMinMax(arr,min,max,ind+1);
	}
}
