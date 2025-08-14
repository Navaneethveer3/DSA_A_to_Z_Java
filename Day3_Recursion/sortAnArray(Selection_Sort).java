public class sortAnArray {

	public static void main(String[] args) {
		int[] arr = {3,5,4,2,6,1,7};
		sort(arr,0,0);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	static void sort(int[] arr, int l, int ind) {
		if(ind==arr.length || l==arr.length) return;
		int[] minValue = {Integer.MAX_VALUE};
		int[] minInd = {ind};
		findMinValue(arr,minValue,minInd,ind);
		swap(arr,l,minInd[0]);
		sort(arr,l+1,l+1);
	}
	static void findMinValue(int[] arr, int[] minValue, int[] minInd, int ind) {
		if(ind==arr.length) return;
		if(minValue[0]>arr[ind]) {
			minValue[0] = arr[ind];
			minInd[0] = ind;
		}
		findMinValue(arr,minValue,minInd,ind+1);
	}
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
