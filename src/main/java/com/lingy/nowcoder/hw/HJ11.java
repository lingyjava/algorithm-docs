package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ly
 * @apiNote HJ11 数字颠倒
 */
public class HJ11 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = sc.nextInt();

            char[] chars = String.valueOf(num).toCharArray();

            for (int i = chars.length - 1; i >= 0; i--) {
                System.out.print(chars[i]);
            }
        }
    }

    public void solutionB() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = sc.nextInt();

            StringBuilder sb = new StringBuilder(String.valueOf(num));
            System.out.println(sb.reverse());
        }
    }

}
