class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        // Use a dummy node create a swapped LinkedList;
        ListNode dummyHead = new ListNode(0);
        ListNode dummyTemp = dummyHead;
        ListNode temp = head, after = head.next;
        while(after!=null){
            dummyTemp.next = after;
            temp.next = after.next;
            after.next = temp;
            dummyTemp = temp;
            temp = temp.next;
            if(temp==null) return dummyHead.next;
            after = temp.next;
        }
        return dummyHead.next;
    }
}
