import java.util.Arrays;

public class Leetcode {

    public static void main(String[] args ){
        int x = 1;
        int y = 4;
        LinkedList list = new LinkedList(); 
        list.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node thrid = new LinkedList.Node(3);
        LinkedList.Node fourth = new LinkedList.Node(4);
        LinkedList.Node fivth = new LinkedList.Node(5);
        list.head.next = second;
        second.next = thrid;
        thrid.next = fourth;
        fourth.next = fivth;
        list.printList(reverseList(list.head));
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

    // 206 Reverse Linked List https://www.geeksforgeeks.org/reverse-a-linked-list/

    public static LinkedList.Node reverseList(LinkedList.Node head) {
        LinkedList.Node cur = head;
        LinkedList.Node pre  = null;
        while(cur != null){
            LinkedList.Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
