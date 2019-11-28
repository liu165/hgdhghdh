package com.company;
import	java.util.Scanner;
/**
 * @author xiaoliu
 * @date 2019/11/22 16:51
 */
//题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class Test5 {
    public static void main(String[] args) {
        int abccount=0;
        int spacecount=0;
        int numcount=0;
        int othercount=0;
        Scanner input=new Scanner(System.in);
        String toString=input.nextLine();
        char [] ch=toString.toCharArray();

        for(int i=0;i<ch.length;i++) {
            if(Character.isLetter(ch[i])) {//这个类比较牛逼啊
                abccount++;
            }else if(Character.isDigit(ch[i])) {
                numcount++;
            }else if(Character.isSpaceChar(ch[i])){
                spacecount++;
            }else {
                othercount++;
            }
        }
        System.out.println(abccount);
        System.out.println(spacecount);
        System.out.println(numcount);
        System.out.println(othercount);

    }
}
