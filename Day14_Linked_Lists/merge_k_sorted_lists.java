class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n==0) return null;
        ListNode last = lists[0];

        // Recursively sort the LinkedLists;
        for(int i=1;i<n;i++){
            last = merge(last,lists[i]);
        }
        return last;
    }
    static ListNode merge(ListNode head1, ListNode head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy, cur1 = head1, cur2 = head2;
        while(cur1!=null && cur2!=null){
            if(cur1.val<cur2.val){
                temp.next = cur1;
                cur1 = cur1.next;
            }
            else{
                temp.next = cur2;
                cur2 = cur2.next;
            }
            temp = temp.next;
        }
        temp.next = cur1==null?cur2:cur1;
        return dummy.next;
    }
}
