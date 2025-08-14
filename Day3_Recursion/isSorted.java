public class isSorted {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		if(sortCheck(arr,0)) {
			System.out.println("The Array is sorted.");
		}
		else {
			System.out.println("The Array is not sorted.");
		}
	}
	static boolean sortCheck(int[] arr, int ind) {
		if(ind==arr.length-1) return true;
		if(arr[ind]>arr[ind+1]) return false;
		return sortCheck(arr,ind+1);
	}
}
