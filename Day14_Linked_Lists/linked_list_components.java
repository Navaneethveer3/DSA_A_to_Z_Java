class Solution {
    public int numComponents(ListNode head, int[] nums) {

        // Use HashSet to make a track of elements;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        ListNode cur = head;
        int comp = 0;
        while(cur!=null){
            ListNode temp = cur;
            if(set.contains(cur.val)) comp++;
            while(cur!=null && set.contains(cur.val)){
                cur = cur.next;
            }
            if(cur==null) return comp;
            cur = cur.next;
        }
        return comp;
    }
}
