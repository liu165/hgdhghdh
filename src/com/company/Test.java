package com.company;

/**
 * @author xiaoliu
 * @date 2019/11/22 17:22
 */
public class Test {
//    【程序10】
//    题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
public static void main(String[] args) {
    Double i = 100.0;
    for (int j = 0; j <10 ; j++) {
        i=i/2;

    }
    System.out.println(i);

    double h=100;
    double s=100;
    for(int t=1;t<=10;t++) {
        h=h/2;
        s=s+2*h;
    }
    System.out.println(s);
    System.out.println(h);

}
}
