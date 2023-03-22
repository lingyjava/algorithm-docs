package com.lingy.leetcode.offer.list;

import com.lingy.api.ListNode;
import org.junit.Test;

/**
 * @author ly
 * @Date: 2022/9/16 16:13
 * @see ListNode
 */
public class Offer24 {

    /*
    * <a href = "https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/">剑指 Offer 24. 反转链表</a>
    *
    * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
    * 输入: 1->2->3->4->5->NULL
    * 输出: 5->4->3->2->1->NULL
    * */

    /**
     * 反转链表
     * ListNode        : 1 -> 2 -> 3 -> 4 -> 5 -> NULL
     * ReverseListNode : NULL <- 1 <- 2 <- 3 <- 4 <- 5
     * */
    public ListNode reverseList(ListNode head) {
        // 初始化节点
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            // 保存当前的下一个节点
            ListNode next = cur.next;
            // 将当前的下一个节点设置为当前的上一个节点
            cur.next = pre;
            // 将当前节点赋值为下一个节点的上一个节点
            pre = cur;
            // 将当前节点设置为下一个节点
            cur = next;
        }
        // 最后当前节点为空,所以返回当前的上一个节点,就是头节点
        return pre;
    }

    private ListNode getListNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        return head;
    }

    @Test
    public void execute() {
        ListNode listNode = getListNode();
        System.out.print("listNode : ");
        listNode.printListNode();

        ListNode reverseListNode = reverseList(getListNode());
        System.out.print("reverseListNode : ");
        reverseListNode.printListNode();


    }
}

