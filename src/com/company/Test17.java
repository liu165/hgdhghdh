package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author xiaoliu
 * @date 2019/11/26 11:28
 */
public class Test17 {
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    //
    //说明：
    //
    //你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
    //
    //示例 1:
    //
    //输入: [2,2,1]
    //输出: 1
    //示例 2:
    //
    //输入: [4,1,2,1,2]
    //输出: 4
    //

    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        String []i  = s.nextLine().split(",");
        //用一个map来解决是最好的结果
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        for (int i1 = 0; i1 < i.length; i1++) {
            if(stringIntegerHashMap.get(i[i1])==null){
                stringIntegerHashMap.put(i[i1],1);
            }else{
                stringIntegerHashMap.put(i[i1],stringIntegerHashMap.get(i[i1])+1);
            }
        }
        Set<String> strings = stringIntegerHashMap.keySet();
        for (String ss:
             strings ) {
            System.out.println(ss);
        }
    }
}
