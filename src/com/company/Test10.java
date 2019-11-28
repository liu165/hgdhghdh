package com.company;

/**
 * @author xiaoliu
 * @date 2019/11/22 17:41
 */
public class Test10 {
    public static int test(int i,int num){
        if(i==5){
            return num;
        }
        num+=2;
        i++;
       return  test(i,num);
    }
    public static void main(String[] args) {
//        题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？
        System.out.println(test(1,10));
        int age=10;
        for(int i=2;i<=5;i++) {
            age+=2;
        }
        System.out.println( age);
    }
}
