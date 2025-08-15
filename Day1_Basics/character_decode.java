import java.util.*;

public class character_decode2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		//11a --> aaaaaaaaaaa
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length()-1;i++) {
			int num = 0;
			char c = str.charAt(i);
			while('0'<=c && c<='9') {
				int val = c-'0';
				num = (num*10)+val;
				i++;
				c = str.charAt(i);
			}
			c = str.charAt(i);
			for(int j=0;j<num;j++) {
				sb.append(Character.toUpperCase(c));
			}
		}
		System.out.println("Decoded String is : "+sb);
	}

}
