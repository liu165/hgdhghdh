package com.company;
import java.util.*;

/**
 * @author xiaoliu
 * @date 2019/11/25 16:45
 */
public class Test14 {
    public static void main(String[] args) {
//        题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
        //约瑟夫环问题
        Scanner in = new Scanner(System.in);
        while (true) {
            int i = in.nextInt();//输入人数
            //用队列最好
            //队列可以用队列来解决
            Queue<Integer> arrayList = new LinkedList<Integer>();
            //如果=1，那么结束循环
            for (int j = 0; j < i; j++) {
                arrayList.add((j + 1));
            }
            //2.算法
            int counts = 0;//计数器
            while (arrayList.size()!=1) {
                //1.出队列
                Integer person = arrayList.poll();
                //2.计数器++
                counts++;
                //3.判断
                if (counts % 3 == 0) {
                    //是,打印
                    System.out.println(person);
                } else {
                    //不是,继续入队列
                    arrayList.add(person);
                }

            }
            System.out.println(arrayList);
        }
    }
}

