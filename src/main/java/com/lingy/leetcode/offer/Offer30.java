package com.lingy.leetcode.offer;

import com.lingy.api.Solution;

import java.util.Stack;

/**
 * @author ly
 * @Date: 2022/9/16 14:08
 * @DESC: <a href = "https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/">剑指 Offer 30. 包含min函数的栈</a>
 * */
public class Offer30 implements Solution {
    @Override
    public void solution() {

    }

    /*
    * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中.
    * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
    *
    * 定义一个栈(stack)用来存储数据。
    *    一个辅助栈(minStack)用来存储最小的元素,minStack栈顶永远是最小的元素。
    *
    * 每次新增元素,与minStack栈顶的元素对比,将更小的插入minStack栈顶。
    * 每次删除元素,将 stack 和 minStack
    * */

    class MinStack {

        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            stack.push(x);
            minStack.push(minStack.peek() < x ? minStack.peek() : x);
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            if (!stack.empty()) {
                return minStack.peek();
            }
            throw new NullPointerException();
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.min();
     */
}
