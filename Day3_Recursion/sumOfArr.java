public class sumOfArr {

	public static void main(String[] args) {
		int[] arr = {2,6,6,8,2};
		System.out.println("The sum of arr : "+sum(arr,0));
	}
	static int sum(int[] arr, int ind) {
		if(ind==arr.length) return 0;
		return arr[ind]+sum(arr,ind+1);
	}

}
