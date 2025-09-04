class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;

        // Use a dummy list to create a new reversed LinkedList;
        ListNode dummy = new ListNode(0);
        ListNode reverse = new ListNode(0);
        ListNode dh = dummy, rh = reverse, cur = head;
        int i = 1;
        while(i<=right){
            ListNode node = new ListNode(cur.val);
            if(left<=i && i<=right){
                rh.next = node;
                rh = rh.next;
            }
            else{
                dh.next = node;
                dh = dh.next;
            }
            i++;
            cur = cur.next;
        }
        reverse = reverse(reverse.next);
        dh.next = reverse;
        while(dh.next!=null){
            dh = dh.next;
        }
        while(cur!=null){
            ListNode node = new ListNode(cur.val);
            dh.next = node;
            dh = dh.next;
            cur = cur.next;
        }
        return dummy.next;
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
