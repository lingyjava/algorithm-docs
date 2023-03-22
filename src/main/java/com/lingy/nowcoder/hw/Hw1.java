package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

/**
 * @author ly
 * @createDate: 2023/3/22 10:52
 */
public class Hw1 implements Solution {

    @Test
    @Override
    public void solution() {
        String word = "hello nowcoder";
        int lastWordLen = lengthOfLastWord(word);
        System.out.println(lastWordLen);
    }

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
