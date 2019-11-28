package com.company;

public class Main {
//    题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
    //覅伯拉丘函数
    public static void main(String[] args) {
	// write your code here
        long f1=1,f2=1,f;
        int M=100;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=3;i<M;i++) {
            f=f2;
            f2=f1+f2;
            f1=f;
            System.out.println(f2);
        }

    }
}
