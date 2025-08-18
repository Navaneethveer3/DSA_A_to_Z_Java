import java.util.*;

public class letter_phone_number_combo {

	public static void main(String[] args) {
		String digits = "23";
		List<String> combinations = letterCombinations(digits);
		System.out.println(combinations);
	}
	public static List<String> letterCombinations(String digits) {
	      Map<Integer,String> map = new HashMap<>();
	      map.put(2,"abc");
	      map.put(3,"def");
	      map.put(4,"ghi");
	      map.put(5,"jkl");
	      map.put(6,"mno");
	      map.put(7,"pqrs");
	      map.put(8,"tuv");
	      map.put(9,"wxyz");
	      List<String> combi = new ArrayList<>();
	      if(digits.length()==0) return combi;
	      generate(combi,digits,new StringBuilder(),map,0);
	      return combi;
	    }
	    static void generate(List<String> combi, String digits, StringBuilder sb, Map<Integer,String> map, int i){
	      if(sb.length()==digits.length()){
	        if(sb.length()==0) return;
	        combi.add(sb.toString());
	        return;
	      }
	      if(i>=digits.length()){
	        return;
	      }
	      int digit = digits.charAt(i)-'0';
	      String str = map.get(digit);
	      for(int j=0;j<str.length();j++){
	        char c = str.charAt(j);
	        sb.append(c);
	        generate(combi,digits,sb,map,i+1);
	        sb.setLength(sb.length()-1);
	      }
	    }
}
