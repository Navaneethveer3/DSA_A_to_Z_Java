class Solution {
    int len;
    static ListNode ll;
    public Solution(ListNode head) {
        ll = head;
        ListNode cur = head;

        // Calculate the length and generate a random number, then traverse to that node and return that node;
        len = 0;
        while(cur!=null){
            len++;
            cur = cur.next;
        }
    }
    
    public int getRandom() {
        if(len==1) return ll.val;
        Random rand = new Random();
        int n = rand.nextInt(len);
        ListNode cur = ll;
        for(int i=0;i<n;i++){
            cur = cur.next;
        }
        return cur.val;
    }
}
