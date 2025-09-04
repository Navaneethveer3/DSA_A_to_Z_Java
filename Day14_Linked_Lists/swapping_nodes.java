class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp = head, first = head;
        for(int i=1;i<k;i++){
            temp = temp.next;
        }
        ListNode second = temp;
        while(temp.next!=null){
            temp = temp.next;
            first = first.next;
        }

        // Find the two nodes  and just swap their values;
        int val = first.val;
        first.val = second.val;
        second.val = val;
        return head;
    }
}
