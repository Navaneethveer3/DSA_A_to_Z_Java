class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        // Reverse the lists and perform addition, then append the nodes to dummy list;
        ListNode reverse1 = reverse(l1);
        ListNode reverse2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode t1 = reverse1, t2 = reverse2, temp = dummy;
        int carry = 0;
        while(t1!=null && t2!=null){
            int sum = t1.val+t2.val+carry;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
            carry = sum/10;
            t1 = t1.next;
            t2 = t2.next;
        }
        while(t1!=null){
            int sum = t1.val+carry;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
            carry = sum/10;
            t1 = t1.next;
        }
        while(t2!=null){
            int sum = t2.val+carry;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
            carry = sum/10;
            t2 = t2.next;
        }
        if(carry>0){
            ListNode node = new ListNode(carry%10);
            temp.next = node;
            temp = temp.next;
        }

        // Return the reverse of the dummy list, as the original lists are reversed first;
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
