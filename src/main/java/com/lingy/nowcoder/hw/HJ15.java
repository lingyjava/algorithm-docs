package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.*;

/**
 * @author ly
 * @apiNote HJ15 求int型正整数在内存中存储时1的个数
 */
public class HJ15 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    /**位运算解法*/
    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = sc.nextInt();

            int resource = 0;
            for (int i = 0; i < 32; i++) {
                if ((num & 1) == 1) {
                    resource++;
                }
                num = num >>> 1;
                if (0 == num) {
                    break;
                }
            }
            System.out.println(resource);
        }
    }

    /**进制转换*/
    public void solutionB() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = sc.nextInt();
            String str = Integer.toBinaryString(num);

            System.out.println(str.length() - str.replace("1","").length());
        }
    }

}
