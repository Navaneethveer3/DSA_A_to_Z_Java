import java.util.*;

public class assessment_day2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		//Find first Set and Reset bit from left;
		int temp = n;
		int len = 0;
		while(temp>0) {
			temp >>= 1;
			len++;
		}
		int firstSetIndex = 0;
		boolean firstSet = false;
		int firstResetIndex = 0;
		boolean firstReset = false;
		temp = n;
		while(temp>0) {
			if((((temp>>len-1)&1)==1) && !firstSet) {
				System.out.println("The first set bit from left is : "+firstSetIndex);
				firstSet = true;
			}
			else if((((temp>>len-1)&1)==1) && !firstReset) {
				System.out.println("The first reset bit from left is : "+firstResetIndex);
				firstReset = true;
			}
			if(firstSet && firstReset) break;
			temp >>= 1;
			firstSetIndex++;
			firstResetIndex++;
		}
		if(!firstSet) {
			System.out.println("The set bit doesn't exist in number");
		}
		if(!firstReset) {
			System.out.println("The reset bit doesn't exist in number");
		}
		
	}

}
