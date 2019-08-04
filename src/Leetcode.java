import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class Leetcode {

    public static void main(String[] args ){
        int x = 1;
        int y = 4;
        LinkedList list = new LinkedList();
        System.out.print(reverseList(list.get(0)));
    }

    /* 461. Hamming Distance
    * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
    * Given two integers x and y, calculate the Hamming distance.
    */
    public static int hammingDistance(int x, int y) {
        int count = 0;
    boolean[] bitx = new boolean[32];
        for (int i = 31; i>=0; i-- ){
        bitx[i] = (x & (1 << i)) !=0;
    }
    boolean[] bity = new boolean[32];
        for (int i = 31; i>=0; i-- ){
        bity[i] = (y & (1 << i)) !=0;
    }
        for(int i = 31; i>=0; i--){
        if(bitx[i] != bity[i]){
            count++;
            }
        }
        return count;
    }

    public static int hammingDistance_Alt(int x, int y){
        return Integer.bitCount(x^y);
    }

    // 206 Reverse Linked List

    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre  = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
