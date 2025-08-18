import java.util.*;

public class word_break {

	public static void main(String[] args) {
		String str = "aaaaaaa";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("aaaa");
		wordDict.add("aaa");
		System.out.println(wordBreak(str,wordDict));
	}
	public static boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] map = new Boolean[s.length()];
        Set<String> set = new HashSet<>(wordDict);
        return check(set,map,s,"",0);
    }
    static boolean check(Set<String> set, Boolean[] map, String word, String str, int ind){
        if(ind>=word.length()) return true;
        if(map[ind]!=null) return map[ind];
        for(int i=ind;i<word.length();i++){
            String prefix = word.substring(ind,i+1);
            if(set.contains(prefix) && check(set,map,word,str,i+1)){
                map[ind] = true;
                return true;
            }
        }
        map[ind] = false;
        return false;
    }
}
