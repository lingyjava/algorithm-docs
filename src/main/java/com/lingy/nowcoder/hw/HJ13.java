package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author ly
 * @apiNote HJ13 句子逆序
 */
public class HJ13 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String str = sc.nextLine();

            String[] strings = str.split(" ");

            for (int i = strings.length - 1; i >= 0; i--) {
                System.out.print(strings[i] + " ");
            }

        }
    }
    
}
