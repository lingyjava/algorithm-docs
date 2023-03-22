package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ly
 * @apiNote HJ3 明明的随机数
 * */
public class HJ3 implements Solution {

    @Test
    @Override
    public void solution() {
        treeSet();
    }

    public void treeSet() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < num; i++) {
                set.add(sc.nextInt());
            }
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

}
