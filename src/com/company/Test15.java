package com.company;

/**
 * @author xiaoliu
 * @date 2019/11/26 10:29
 */
public class Test15 {
    //【程序48】
    //题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
    //2,3,4,5
    //7,8,9,10
    //7,8,9,0
    //
    public static void main(String[] args) {
        int[] i = {4,7,8,9};
        for (int i1 = 0; i1 < i.length; i1++) {
            i[i1] = (i[i1]+5)%10;
        }
        int temp;
        temp =i[0];
        i[0] = i[3];
        i[3] = temp;
        temp =i[1];
        i[1] = i[2];
        i[2] = temp;
        for (int i1 = 0; i1 < i.length; i1++) {
            System.out.println(i[i1]);

        }
        temp =i[0];
        i[0] = i[3];
        i[3] = temp;
        temp =i[1];
        i[1] = i[2];
        i[2] = temp;
        for (int i1 = 0; i1 < i.length; i1++) {
            if ((i[i1]-5)>0){
                i[i1] =(i[i1]-5) ;
            }else {
                i[i1] =(i[i1]-5) +10;
            }


        }
        System.out.println();
        for (int i1 = 0; i1 < i.length; i1++) {
            System.out.print(i[i1]);

        }


    }
}
