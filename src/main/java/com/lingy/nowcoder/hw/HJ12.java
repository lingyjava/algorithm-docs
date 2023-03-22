package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author ly
 * @apiNote HJ12 字符串反转
 */
public class HJ12 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer(str);

            System.out.println(sb.reverse());
        }
    }

}
