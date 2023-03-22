# 30·包含min函数的栈

- [30·包含min函数的栈](#30包含min函数的栈)
  - [题目描述](#题目描述)
  - [代码实现](#代码实现)

## 题目描述
- [剑指 Offer 30. 包含min函数的栈](https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/)

定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。

示例:
```text
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.min();   --> 返回 -2.
```

## 代码实现
- [Offer30](/src/main/java/com/lingy/leetcode/offer/Offer30.java)