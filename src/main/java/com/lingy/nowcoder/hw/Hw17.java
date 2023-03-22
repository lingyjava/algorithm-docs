package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ly
 * @Date: 2022/8/16 14:37
 */
public class Hw17 implements Solution {

    /**
     * <a href = "https://www.nowcoder.com/practice/119bcca3befb405fbe58abe9c532eb29?tpId=37&tqId=21240&rp=1&ru=/exam/oj/ta&qru=/exam/oj/ta&sourceUrl=%2Fexam%2Foj%2Fta%3Fpage%3D1%26tpId%3D37%26type%3D37&difficulty=undefined&judgeStatus=undefined&tags=&title=">华为机试-17-坐标移动</a>
     * <a href = "https://www.runoob.com/regexp/regexp-syntax.html">正则表达式</a>
     * */
    @Test
    @Override
    public void solution(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = reader.readLine();
            String[] in = str.split(";");
            int x = 0;
            int y = 0;
            for (String cur : in) {
                if (!cur.matches("[WASD][0-9]{1,2}")) {
                    continue;
                }
                int val = Integer.parseInt(cur.substring(1));
                switch (cur.charAt(0)) {
                    case 'W':
                        y += val;
                        break;
                    case 'A':
                        x -= val;
                        break;
                    case 'S':
                        y -= val;
                        break;
                    case 'D':
                        x += val;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(x + "," + y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
