package com.company;

import java.util.Scanner;

/**
 * @author xiaoliu
 * @date 2019/11/25 16:31
 */
public class Test13 {
    //【程序36】
    //题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
    public static void main(String[] args) {
//        1,2,3,4
//        3,4,1,2
//        int [] i = new int[100];
//        i[1]=1;
//        i[2]=2;
//        i[3]=3;
//        i[4]=4;
//        int m=2;
//        for(int j=4;j>0;j--){
//            i[j+m]=i[j];
//        }
//        for(int k=1;k<=m;k++){
//            i[k]=i[4+k];
//        }
//        for (int i1 = 1; i1 <=4; i1++) {
//            System.out.println(i[i1]);
//        }

        int N=10;
        int M=3;
        Scanner input =new Scanner(System.in);
        int[] a=new int[N];
        for(int i=0;i<N;i++) {
            a[i]=input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int[] b=new int[M];
        for(int i=0;i<M;i++) {
            b[i]=a[N-M+i];
        }
        for(int i=N-1;i>=M;i--) {
            a[i]=a[i-M];
        }
        for(int i=0;i<M;i++) {
            a[i]=b[i];
        }
        System.out.println("");
        for(int i=0;i<N;i++) {
            System.out.println(a[i]);
        }

    }
}
