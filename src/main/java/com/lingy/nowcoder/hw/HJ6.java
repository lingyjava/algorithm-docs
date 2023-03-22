package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author ly
 * @apiNote HJ6 质数因子
 */
public class HJ6 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    /**穷举解法*/
    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int number = sc.nextInt();

            if (number == 1) {
                System.out.println(1);
            }
            if (number == 2) {
                System.out.println(1);
            }

            int i = 2;
            while (number > 1) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                    number = number / i;
                }else {
                    i++;
                }
            }
        }
    }

    /**穷举优化解法*/
    public void solutionB() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int number = sc.nextInt();
            double sqrt = Math.sqrt(number);

            if (number == 1) {
                System.out.println(1);
            }
            if (number == 2) {
                System.out.println(1);
            }

            for (int i = 2; i <= sqrt; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                    number = number / i;
                    i--;
                }
            }
            if (number > 1) {
                System.out.print(number);
            }
        }
    }
}
