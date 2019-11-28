package com.company;
import	java.util.Scanner;
import java.util.Scanner;
/**
 * @author xiaoliu
 * @date 2019/11/22 16:40
 */
/*题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。*/
public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int result = input.nextInt();
            if (result >= 90) {
                System.out.println("A");
            } else if (result >= 60) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }


    }
}
