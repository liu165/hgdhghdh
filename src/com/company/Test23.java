package com.company;

/**
 * @author xiaoliu
 * @date 2019/11/28 16:33
 */
public class Test23 {
    //【程序22】 题目：利用递归方法求5!。
    //
    //1.程序分析：递归公式：fn=fn_1*4!
    public static int jiecheng(int n,int sum){
        if(n==1){
            return sum+1;
        }else{
            sum += n*n ;
            return jiecheng( n-1,sum);
        }
    }
    public static void main(String[] args) {
        System.out.println(jiecheng(2,0));
    }
}
