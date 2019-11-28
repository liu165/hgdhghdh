package com.company;

/**
 * @author xiaoliu
 * @date 2019/11/22 15:59
 */
public class Test2 {
    public static void main(String[] args) {
//        题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
        for(int i=100;i<999;i++){
            if(i==(Math.pow((i/100),3)+Math.pow((i/10%10),3)+Math.pow((i%10),3))){
                System.out.println(i);
            }
        }
    }
}
