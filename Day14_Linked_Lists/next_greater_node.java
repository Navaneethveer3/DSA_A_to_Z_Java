class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while(cur!=null){
            n++;
            cur = cur.next;
        }
        int[] nge = new int[n];
        head = reverse(head);

        // Use nge technique;
        Stack<Integer> stk = new Stack<>();
        cur = head;
        int i = n-1;
        while(cur!=null){
            while(!stk.isEmpty() && cur.val>=stk.peek()){
                stk.pop();
            }
            nge[i--] = stk.isEmpty()?0:stk.peek();
            stk.push(cur.val);
            cur = cur.next;
        }
        head = reverse(head);
        return nge;
    }
    static ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode prev = null, cur = head;
        while(cur!=null){
            ListNode after = cur.next;
            cur.next = prev;
            prev = cur;
            cur = after;
        }
        return prev;
    }
}
