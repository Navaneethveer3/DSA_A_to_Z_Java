public class ceil_of_a_number {

	public static void main(String[] args) {
		int[] arr = {1, 2, 8, 10, 11, 12, 19};
		int x = 5;
		System.out.printf("The ceil of %d is %d",x,findCeil(arr,x));
	}
	public static int findCeil(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        if(x>arr[high]) return -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x) high = mid-1;
            else low = mid+1;
        }
        return arr[low];
    }
}
