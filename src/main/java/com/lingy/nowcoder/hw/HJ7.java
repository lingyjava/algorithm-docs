package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author ly
 * @apiNote HJ7 取近似值
 */
public class HJ7 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double number = sc.nextDouble();
            if (number <= 0) {
                throw new IllegalArgumentException("请输入一个正浮点数");
            }
            System.out.println(Math.round(number));
        }
    }

    public void solutionB() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double number = sc.nextDouble();
            if (number <= 0) {
                throw new IllegalArgumentException("请输入一个正浮点数");
            }
            System.out.println((int) (number + 0.5));
        }
    }
}
