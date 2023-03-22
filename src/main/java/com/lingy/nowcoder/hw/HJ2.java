package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

/**
 * @author ly
 * @apiNote HJ2 计算某字符出现次数
 */
public class HJ2 implements Solution {

    /*
    * 给一个由字母、数字和空格组成的字符串和一个字符。
    * 输出输入字符串中该字符的出现次数。不区分大小写字母。
    *
    * 输入：
    * ABCabc
    * A
    * 输出：
    * 2
    * */

    @Test
    @Override
    public void solution() {
        String str = "ABCabc";
        String targer = "A";
        int len = charOccurrences(str, targer);
        System.out.println(len);
    }

    public int charOccurrences(String s,String letter) {
        s = s.toUpperCase();
        letter = letter.toUpperCase();
        char c = letter.toCharArray()[0];
        int num = 0;
        for(int i = 0; i <= s.length() - 1 ; i++){
            if(s.charAt(i) == c){
                num++;
            }
        }
        return num;
    }

    /**字符串替换*/
    public int replace(String s,String letter) {
        return s.length() - s.toUpperCase().replaceAll(letter.toUpperCase(),"").length();
    }
}
