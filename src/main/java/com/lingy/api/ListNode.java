package com.lingy.api;

/**
 * @author ly
 * @Date: 2022/9/16 16:17
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) { val = x; }

    public int length() {
        int len = 1;
        ListNode node = this;
        while (node.next != null) {
            node = node.next;
            len++;
        }
        return len;
    }

    public void printListNode() {
        System.out.print("[" + this.val);
        ListNode listNode = this.next;
        while (listNode != null) {
            System.out.print("," + listNode.val);
            listNode = listNode.next;
        }
        System.out.print("]\n");

    }
}
