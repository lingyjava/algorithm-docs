package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ly
 * @apiNote HJ5 进制转换
 */
public class HJ5 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    public void solutionA(){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            str = str.substring(2);
            System.out.println(Integer.parseInt(str,16));
        }
    }
}
