package com.lingy.leetcode.offer.stack;

import com.lingy.api.Solution;

import java.util.Stack;

/**
 * @author ly
 * @Date: 2022/9/15 14:30
 * @DESC: 剑指 Offer 09. 用两个栈实现队列
 */
public class Offer09 implements Solution {
    @Override
    public void solution() {

    }

    /*
    * 用两个栈实现一个队列。
    * 队列的声明如下，实现它的两个函数 appendTail 和 deleteHead
    * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。
    * (若队列中没有元素，deleteHead操作返回 -1 )
    *
    * 队列：先进先出
    * 栈：先进后出
    *
    * 解题思想:
    * 1、根据队列和栈的特性可知：队列删除对象时是最先添加的对象,而栈删除对象时是最后添加的对象。
    * 2、要实现队列的deleteHead(),定义一个栈用来存储对象,另一个栈用来删除对象。
    * 3、在删除对象时,取出栈队列的栈顶对象删除。
    * 4、当出栈队列为空时,将入栈队列中的对象转移到出栈队列。当入栈队列也为空时,return -1 ;
    *
    * Stack api:
    * boolean empty() : 判断是否为空 ;  true--空 , false--非空;
    * Object peek() : 查看堆栈顶部的对象 ;
    * Object pop() : 移除堆栈顶部的对象,并作为此函数的值返回该对象;
    * Object push(Object element) : 把对象压入堆栈顶部 ;
    * int search(Object element) : 返回对象在堆栈中的位置，以 1 为基数 ;
     * */


    private class CQueue {
        /**入栈队列*/
        private Stack<Integer> inStack;
        /**负责出栈*/
        private Stack<Integer> outStack;

        public CQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void appendTail(int value) {
            inStack.push(value);
        }

        public int deleteHead() {

            if (!outStack.empty()) {
                return outStack.pop();
            }else {
                while (!inStack.empty()) {
                    outStack.push(inStack.pop());
                }
                return outStack.empty() ? -1 : outStack.pop();
            }
        }
    }
}
