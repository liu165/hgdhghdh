package com.company;

/**
 * @author xiaoliu
 * @date 2019/11/27 16:19
 */
public class Test20 {
    //请你帮忙设计一个程序，用来找出第 n 个丑数。
    //
    //丑数是可以被 a 或 b 或 c 整除的 正整数。
    //
    // 
    //
    //示例 1：
    //
    //输入：n = 3, a = 2, b = 3, c = 5
    //输出：4
    //解释：丑数序列为 2, 3, 4, 5, 6, 8, 9, 10... 其中第 3 个是 4。
    //示例 2：
    //
    //输入：n = 4, a = 2, b = 3, c = 4
    //输出：6
    //解释：丑数序列为 2, 3, 4, 6, 8, 9, 12... 其中第 4 个是 6。
    //示例 3：
    //
    //输入：n = 5, a = 2, b = 11, c = 13
    //输出：10
    //解释：丑数序列为 2, 4, 6, 8, 10, 11, 12, 13... 其中第 5 个是 10。
    //示例 4：
    //
    //输入：n = 1000000000, a = 2, b = 217983653, c = 336916467
    //输出：1999999984
    // 
    //
    //提示：
    //
    //1 <= n, a, b, c <= 10^9
    //1 <= a * b * c <= 10^18
    //本题结果在 [1, 2 * 10^9] 的范围内

    public static void main(String[] args) {
        //暴力法破除
        //n = 5, a = 2, b = 11, c = 13
        int a = 2;
        int b = 11;
        int c = 13;
        int n = 5;
        int place =0;
        int i =1;
        Boolean isOver = false;
        while (!isOver){
            if(i%a==0||i%b==0||i%c==0){
                place++;
                System.out.print(i+"   ");
                if(place==n){
                    isOver = true;
                    System.out.println();
                    System.out.println("-----------------------");
                    System.out.println(i);
                }
            }
            i++;
        }

    }
}
