package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

/**
 * @author ly
 * @apiNote HJ1 字符串最后一个单词的长度
 */
public class HJ1 implements Solution {

    /*
    * 给一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
    * 返回字符串中最后一个单词的长度。单词仅由字母组成、不包含任何空格字符。
    *
    * 输入：hello nowcoder
    * 输出：8
    * 说明：最后一个单词为nowcoder，长度为8
    * */

    @Test
    @Override
    public void solution() {
        String word = "hello nowcoder";
        int lastWordLen = lengthOfLastWord(word);
        System.out.println(lastWordLen);
    }


    /**
     * 解题思想：
     * 1. 删除字符串前后的无效空格。
     * 2. 遍历字符串中每个字符与空格字符比较。
     * */
    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim();
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            length++;
        }
        return length;
    }
}
