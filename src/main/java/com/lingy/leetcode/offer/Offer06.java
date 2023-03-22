package com.lingy.leetcode.offer;

import com.lingy.api.ListNode;
import com.lingy.api.Solution;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author ly
 *
 * 剑指 Offer 06. 从尾到头打印链表</a>  <br/>
 * 创建一个同长度的数组,遍历ListNode,从数组尾部开始赋值。
 * <a href = "https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">
 */
public class Offer06 implements Solution {

    /*
     * Title
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     * 示例 1：
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     * */

    @Test
    @Override
    public void solution() {
        ListNode listNode = getListNode();
        int[] result = reversePrint(listNode);
        System.out.println(Arrays.toString(result));
    }

    public int[] reversePrint(ListNode head) {
        int len = head.length();
        int[] arr = new int[len];
        for (int i = len - 1; i >=0; i--) {
            arr[i] = head.val;
            head = head.next;
        }
        return arr;
    }

    private ListNode getListNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        return head;
    }

}
