package com.company;
import java.util.Iterator;
import	java.util.Vector;

import java.util.Vector;

/**
 * @author xiaoliu
 * @date 2019/11/26 13:55
 */
public class Test18 {
    //合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
    //
    //示例:
    //
    //输入:
    //[
    //  1->4->5,
    //  1->3->4,
    //  2->6
    //]
    //输出: 1->1->2->3->4->4->5->6
    public static void main(String[] args) {
        //比较
        int one[] = {1,4,5};
        int two[] = {1,3,4};
        int three[] = {1,4,5};
        Vector <Integer>v = new Vector();
        //one vs two
        Boolean isOver = false ;
        int j=0;
        int i=0;
        int k=0;
        while (!isOver){
            if(one[i] <=two [j]&&one[i] <=three [k]){
                //入one
                v.add(one[i]);
                i++;
            }else if(one[i] <=two [j]&&one[i] >three [k]){
                //入three
                v.add(three[k]);
                k++;
            }
            else if(two[j]<one[i]&&two[j]<three[k]){
                //入two
                v.add(two[j]);
                j++;
            }else if(two[j]<one[i]&&two[j]>three[k]){
                //入three
                v.add(three[k]);
                k++;
            } else if(three[j]>one[i]&&two[j]>three[k]){
                //入two
                v.add(two[j]);
                j++;
            }else if(two[j]<one[i]&&two[j]>three[k]){
                //入three
                v.add(three[k]);
                k++;
            }

            if(i==one.length){
                isOver=true;
                //添加剩下的two
                for (int i1 = j; i1 < two.length; i1++) {
                    v.add(two[j]);
                }
            }
            if(j==two.length){
                isOver=true;
                //添加剩下的two
                for (int i1 = i; i1 < one.length; i1++) {
                    v.add(one[j]);
                }
            }
        }
        //实现的和three进行比较

    }
}
