package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author ly
 * @apiNote HJ8 合并表记录
 */
public class HJ8 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    /**哈希表解法*/
    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Map<Integer,Integer> map = new TreeMap<>();

            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if (map.containsKey(key)) {
                    map.put(key,map.get(key) + value);
                }else {
                    map.put(key,value);
                }
            }

            for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

}
