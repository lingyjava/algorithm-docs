package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.*;

/**
 * @author ly
 * @apiNote HJ9 提取不重复的整数
 */
public class HJ9 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = sc.nextInt();

            String str = String.valueOf(num);

            List<Character> list = new ArrayList<>();
            for (int i = str.length() - 1; i >= 0; i--) {
                if (!list.contains(str.charAt(i))){
                    list.add(str.charAt(i));
                }
            }
            System.out.println(list.toString().replace("[","").replace("]","").replace(",","").replace(" ",""));
        }
    }

    public void solutionB() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = sc.nextInt();

            char[] chars = String.valueOf(num).toCharArray();

            StringBuilder sb = new StringBuilder("");

            for (int i = chars.length - 1; i >= 0; i--) {
                if (!sb.toString().contains(String.valueOf(chars[i]))) {
                    sb.append(chars[i]);
                }
            }

            System.out.println(sb);
        }
    }

}
