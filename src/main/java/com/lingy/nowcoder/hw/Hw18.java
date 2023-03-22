package com.lingy.nowcoder.hw;

import com.lingy.api.Solution;
import org.junit.Test;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author ly
 * @Date: 2022/8/16 14:55
 */
public class Hw18 implements Solution {

    private static final int MAX_MASK = 255;

    /**
     * <a href = "https://www.nowcoder.com/practice/de538edd6f7e4bc3a5689723a7435682?tpId=37&tqId=21241&rp=1&ru=/exam/oj/ta&qru=/exam/oj/ta&sourceUrl=%2Fexam%2Foj%2Fta%3Fpage%3D1%26tpId%3D37%26type%3D37&difficulty=undefined&judgeStatus=undefined&tags=&title=">华为机试-18-识别有效的IP地址和掩码并进行分类统计</a>
     * */
    @Test
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int aNum = 0, bNum = 0, cNum = 0, dNum = 0, eNum = 0, errNum = 0, pNum = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals("end")) {
                break;
            }
            String [] strArr = str.split("~");
            int ipFirst = getIpSeq(strArr[0], 0);
            if (ipFirst == 0 || ipFirst == 127) {
                continue;
            }
            if (maskIsInvaild(strArr[1])) {
                errNum++;
                continue;
            }
            if (ipIsInvaild(strArr[0])) {
                errNum++;
                continue;
            }
            if (ipFirst >= 1 && ipFirst <= 126) {
                aNum++;
            }
            if (ipFirst >= 128 && ipFirst <= 191) {
                bNum++;
            }
            if (ipFirst >= 192 && ipFirst <= 223) {
                cNum++;
            }
            if (ipFirst >= 224 && ipFirst <= 239) {
                dNum++;
            }
            if (ipFirst >= 240 && ipFirst <= 255) {
                eNum++;
            }
            int ipSecond = getIpSeq(strArr[0], 1);
            if (ipFirst == 10 || (ipFirst == 172 && ipSecond >= 16 && ipSecond <= 31) || (ipFirst == 192 && ipSecond ==  168)) {
                pNum++;
            }
        }
        System.out.println(aNum + " " + bNum + " " + cNum + " " + dNum + " " + eNum + " " + errNum + " " + pNum);
    }

    private static int getIpSeq(String ip, int index) {
        String[] ipArr = ip.split("\\.");
        return Integer.parseInt(ipArr[index]);
    }

    private static boolean maskIsInvaild(String mask) {
        String[] maskArr = mask.split("\\.");
        if (maskArr.length != 4) {
            return true;
        }
        String maskBinary = toBinary(maskArr[0]) + toBinary(maskArr[1]) + toBinary(maskArr[2]) + toBinary(maskArr[3]);
        if (!maskBinary.matches("[1]{1,}[0]{1,}")) {
            return true;
        }
        return false;
    }

    private static String toBinary(String num) {
        String numBinary = Integer.toBinaryString(Integer.parseInt(num));
        while (numBinary.length() < 8) {
            numBinary = "0".concat(numBinary);
        }
        return numBinary;
    }

    private static boolean ipIsInvaild(String ip) {
        String[] ipArr = ip.split("\\.");
        if (ipArr.length != 4) {
            return true;
        }
        if (Integer.parseInt(ipArr[0]) > 255 || Integer.parseInt(ipArr[1]) > 255 || Integer.parseInt(ipArr[2]) > 255 || Integer.parseInt(ipArr[3]) > 255) {
            return true;
        }
        return false;
    }

}
