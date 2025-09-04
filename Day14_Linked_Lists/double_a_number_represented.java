class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        head = reverse(head);
        ListNode cur = head;

        // Use track of carry to create extra node if the sum exceeds 10 after the doubling the values and creating the nodes;
        int carry = 0;
        while(cur!=null){
            int sum = (cur.val*2)+carry;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
            carry = sum/10;
            cur = cur.next;
        }
        if(carry>0){
            ListNode node = new ListNode(carry);
            temp.next = node;
            temp = temp.next;
        }
        head = reverse(head);
        return reverse(dummy.next);
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
