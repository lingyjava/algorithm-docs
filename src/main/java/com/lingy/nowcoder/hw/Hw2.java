package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

/**
 * @author ly
 * @createDate: 2023/3/22 10:52
 */
public class Hw2 implements Solution {

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
