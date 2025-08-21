public class floor_of_a_number {

	public static void main(String[] args) {
		int[] arr = {1, 2, 8, 10, 10, 12, 19};
		int x = 5;
		System.out.printf("The floor of %d is %d",x,findFloor(arr,x));
	}
	public static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        if(arr[low]>x) return -1;
        int ind = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=x){
                ind = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return arr[ind];
    }
}
