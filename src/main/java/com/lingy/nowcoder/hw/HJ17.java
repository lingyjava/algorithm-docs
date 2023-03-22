package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ly
 * @apiNote HJ17·坐标移动
 */
public class HJ17 implements Solution {

    @Test
    @Override
    public void solution(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = reader.readLine();
            String[] in = str.split(";");
            int x = 0;
            int y = 0;
            for (String cur : in) {
                if (!cur.matches("[WASD][0-9]{1,2}")) {
                    continue;
                }
                int val = Integer.parseInt(cur.substring(1));
                switch (cur.charAt(0)) {
                    case 'W':
                        y += val;
                        break;
                    case 'A':
                        x -= val;
                        break;
                    case 'S':
                        y -= val;
                        break;
                    case 'D':
                        x += val;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(x + "," + y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
