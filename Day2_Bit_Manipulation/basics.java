import java.util.*;

public class Basic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		sc.close();
		
		//Check whether i th bit is set or not?
		int temp = 1;
		System.out.println((((n>>i)&1)==1)?"It is a set bit":"It is not a set bit");
		
		//Set i th bit;
		System.out.println("Set i th bit : "+((temp<<i)|n));
		
		//Reset the i th bit;
		temp = 1;
		System.out.println("Reset i th bit : "+((((n>>i)&1)==1)?((temp<<i)^n):n));
		
		//Clear right part after the i th index;
		temp = ~0;
		temp <<= i;
		System.out.println("Clear right part after i th index : "+(n&temp));
		
		//Flip the i th bit;
		temp = 1;
		System.out.println("Flip i th bit : "+((temp<<i)^n));
		
		//Find the binary length of a number;
		int len = 0;
		temp = n;
		while(temp>0) {
			temp >>= 1;
			len++;
		}
		System.out.println("The binary length is : "+len);
		
		//Clear left part before the i th index;
		temp = (1<<i)-1;
		System.out.println("Clear left part before i th index : "+(n&temp));
		
		//Clear first i th bits;
		temp = (1<<(len-i))-1;
		System.out.println("Clear first i bits : "+(n&temp));
		
		//Count Set bits in a number;
		temp = n;
		int countSet = 0;
		while(temp>0) {
			if((temp&1)==1) {
				countSet++;
			}
			temp >>= 1;
		}
		System.out.println("The number of Set bits are : "+countSet);
		
		//Set the first i bits of a number;
		temp = len-i;
		temp = (1<<temp)-1;
		System.out.println("Set the first i bits as Set bits : "+(n|temp));
		
		//Index of first Set bit from right;
		temp = n;
		int rightSetIndex = 0;
		while(temp>0) {
			if((temp&1)==1) {
				System.out.println("The first set bit index from right is : "+rightSetIndex);
				break;
			}
			temp >>= 1;
			rightSetIndex++;
		}
	}

}
