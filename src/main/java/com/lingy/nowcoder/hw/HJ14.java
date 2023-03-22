package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.util.*;

/**
 * @author ly
 * @apiNote HJ14 字符串排序
 */
public class HJ14 implements Solution {

    @Test
    @Override
    public void solution() {
        solutionA();
    }

    /**字符数组排序API解法*/
    public void solutionA() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = Integer.parseInt(sc.nextLine());
            String[] strings = new String[num];
            for (int i = 0; i < num; i++) {
                String input = sc.nextLine();
                strings[i] = input;
            }
            Arrays.sort(strings);
            for (String s : strings) {
                System.out.println(s);
            }
        }
    }

    /**有序队列解法*/
    public void solutionB() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = Integer.parseInt(sc.nextLine());
            PriorityQueue<String> queue = new PriorityQueue<>();

            for (int i = 0; i < num; i++) {
                queue.offer(sc.nextLine());
            }
            while (!queue.isEmpty()){
                System.out.println(queue.poll());
            }
        }
    }

    /**重写List.sort方法解法*/
    public void solutionC() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = Integer.parseInt(sc.nextLine());
            List<String> stringList = new ArrayList<>();

            for (int i = 0; i < num; i++) {
                stringList.add(sc.nextLine());
            }

            stringList.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int i = 0;
                    while (o1.length() > i && o2.length() > i) {
                        if (o1.charAt(i) != o2.charAt(i)) {
                            return o1.charAt(i) > o2.charAt(i) ? 1 : -1;
                        }
                        i++;
                    }
                    if (o1.length() == o2.length()) {
                        return 0;
                    }
                    else {
                        return o1.length() > o2.length() ? 1 : -1;
                    }
                }
            });

            stringList.forEach(System.out::println);
        }
    }
    
}
