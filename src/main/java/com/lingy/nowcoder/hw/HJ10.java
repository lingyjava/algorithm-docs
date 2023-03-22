package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.*;

/**
 * @author ly
 * @apiNote HJ10 字符个数统计
 */
public class HJ10 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String str = sc.nextLine();

            char[] chars = str.toCharArray();

            Set<Character> set = new HashSet<>();

            for (Character c : chars) {
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    set.add(c);
                }
            }
            System.out.println(set.size());
        }
    }

    public void solutionB() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String str = sc.nextLine();

            char[] chars = str.toCharArray();

            BitSet bitSet = new BitSet(128);

            for (char c : chars) {
                if (!bitSet.get(c)) {
                    bitSet.set(c);
                }
            }
            System.out.println(bitSet.cardinality());
        }
    }

}
