class Solution {
    public void reorderList(ListNode head) {
        ListNode prev = null, slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev==null) return;

        // Make the list two parts, then reverse and merge those both lists one by one using merge sort;
        prev.next = null;
        ListNode l1 = head;
        ListNode l2 = reverse(slow);
        head = merge(l1,l2);
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
    static ListNode merge(ListNode head1, ListNode head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead, cur1 = head1, cur2 = head2;
        boolean last = false;
        while(cur1!=null && cur2!=null){
            if(!last){
                temp.next = cur1;
                cur1 = cur1.next;
                last = true;
            }
            else{
                temp.next = cur2;
                cur2 = cur2.next;
                last = false;
            }
            temp = temp.next;
        }
        temp.next = cur1==null?cur2:cur1;
        return dummyHead.next;
    }
}
