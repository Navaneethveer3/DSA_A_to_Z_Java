class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;

        // Use two dummy lists to handle values less than x and greater than or equal to x;
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode dh1 = dummy1, dh2 = dummy2, cur = head;
        while(cur!=null){
            ListNode node = new ListNode(cur.val);
            if(cur.val<x){
                dh1.next = node;
                dh1 = dh1.next;
            }
            else{
                dh2.next = node;
                dh2 = dh2.next;
            }
            cur = cur.next;
        }
        dh1.next = dummy2.next;
        return dummy1.next;
    }
}
