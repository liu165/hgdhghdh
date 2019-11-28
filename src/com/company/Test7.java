package com.company;
import	java.util.Scanner;
/**
 * @author xiaoliu
 * @date 2019/11/22 17:07
 */
public class Test7 {
//    题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int n=input.nextInt();
        int sum=0,b=0;
        for(int i=0;i<n;i++) {
            b+=a;
            sum+=b;
            a=a*10;
        }
        System.out.println(sum);

    }
}
