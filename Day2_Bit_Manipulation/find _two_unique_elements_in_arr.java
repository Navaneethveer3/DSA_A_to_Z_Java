public class assessment_day2 {

	public static void main(String[] args) {
    
		//Find two unique elements in an array;
		int[] arr = {1,2,1,2,7,5,9,5};
		int xor = 0;
		for(int i : arr) {
			xor ^= i;
		}
		int rightSetBit = xor & -xor;
		int a = 0;
		int b = 0;
		for(int i : arr) {
			if((i&rightSetBit)!=0) {
				a ^= i;
			}
			else {
				b ^= i;
			}
		}
		System.out.printf("The two uniques in an array are : %d and %d",a,b);
	}

}
