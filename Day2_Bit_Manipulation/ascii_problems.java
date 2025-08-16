import java.util.*;

public class ascii_problems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		
		//Find the sum of ascii values in a given String;
		int sumOfChars = 0;
		for(char c : str1.toCharArray()) {
			int num = (c-'a')+1;
			sumOfChars += num;
		}
		System.out.println("The sum of Ascii values of the given String is : "+sumOfChars);
		
		//Swap cases in the given String;
		StringBuilder sb = new StringBuilder();
		for(char c : str1.toCharArray()) {
			if('a'<=c && c<='z') {
				sb.append(Character.toUpperCase(c));
			}
			else {
				sb.append(Character.toLowerCase(c));
			}
		}
		System.out.println("The converted case String is : "+sb);
		
		//Concatenate each set from both Strings and convert the remaining left over part to UpperCase();
		StringBuilder concat = new StringBuilder();
		int i = 0;
		int j = 0;
		while(i<str1.length() && j<str2.length()) {
			char c1 = str1.charAt(i++);
			char c2 = str2.charAt(j++);
			concat.append(c1);
			concat.append(c2);
		}
		if(i<str1.length()) {
			concat.append(str1.substring(i).toUpperCase());
		}
		if(j<str2.length()) {
			concat.append(str2.substring(j).toUpperCase());
		}
		System.out.println("The Concatenated String is : "+concat);
	}

}
