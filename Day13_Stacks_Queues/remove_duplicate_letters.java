class Solution {
    public String removeDuplicateLetters(String s) {
        int[] hash = new int[26];
        for(char c : s.toCharArray()){
            hash[c-'a']++;
        }
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            hash[c-'a']--;
            while(!stk.isEmpty() && hash[stk.peek()-'a']>0 && stk.peek()>c && !stk.contains(c)){
                stk.pop();
            }
            if(stk.contains(c)) continue;
            stk.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}
