import java.util.*;

public class character_decode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		// 1a2b3c --> abbccc
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length()-1;i+=2) {
			int num = str.charAt(i)-'0';
			char c = str.charAt(i+1);
			for(int j=0;j<num;j++) {
				sb.append(Character.toUpperCase(c));
			}
		}
		System.out.println("Decoded String is : "+sb);
	}

}
