package com.company;
import	java.util.Scanner;
/**
 * @author xiaoliu
 * @date 2019/11/22 17:52
 */
public class Test11 {
    public static void main(String[] args) {
//        【程序25】
//        题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
        Scanner input = new Scanner(System.in);
        while (true) {
            String s = input.nextLine();
            char[] chars = s.toCharArray();
            if (chars.length == 5 && chars[0] == chars[4] && chars[1] == chars[3]) {
                System.out.println("是回文数");
            } else {
                System.out.println("不是回文数");
            }
        }

    }
}
