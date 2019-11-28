package com.company;

import java.math.BigDecimal;

/**
 * @author xiaoliu
 * @date 2019/11/28 16:04
 */
public class Test21 {
    public static void main(String[] args) {
        //题目：一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？
        // 1.程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。请看具体分析
        //进行暴力法
        long k=0;
        for(k=1;k<=100000;k++){
            if(Math.floor(Math.sqrt(k+100))==Math.sqrt(k+100) && Math.floor(Math.sqrt(k+168))==Math.sqrt(k+168)) {
                System.out.println(k);
            }
     }
    }
}
