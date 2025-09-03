class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;

        // Count frequency using a HashMap;
        Map<Integer,Integer> map = new HashMap<>();
        ListNode cur = head;
        while(cur!=null){
            int val = cur.val;
            map.put(val,map.getOrDefault(val,0)+1);
            cur = cur.next;
        }
        cur = head;
        ListNode lh = new ListNode(0);
        ListNode lt = lh;
        while(cur!=null){
            int val = cur.val;
            if(map.get(val)==1){
                ListNode node = new ListNode(val);
                lt.next = node;
                lt = lt.next;
            }
            cur = cur.next;
        }
        return lh.next;
    }
}
