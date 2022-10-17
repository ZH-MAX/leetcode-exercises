package pers.zh.leetcode;

import java.util.Random;

/**
 * 需求：
 *      定义方法实现随机产生一个5位的验证码
 *      验证码格式：
 *      长度为5
 *      前四位是大写字母或者小写字母
 *      最后一位是数字
 *
 * 分析：
 *      要在一堆没有什么规律的数据中随机抽取
 *      可以先把这些数据存放在数组中
 *      再随机抽取一个索引
 */

public class VerificationCode {
    public static void main(String[] args) {
//        1.把大写字母和小写字母存放在数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
//            ASCII码表   a-->97  A-->65
            if(i<=25){
//                添加小写字母
                chs[i] = (char)(97+i);
            }else {
//                添加大写字母
                chs[i]= (char)(65+i-26);
            }

        }
//        遍历
        /*for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]+" ");
        }*/
//        定义一个字符串类型变量，用来记录最终的结果
        String result = ""; //""-->长度为0的字符串
//        2.随机抽取4次
//        随机抽取数组的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
//        0~51
            int randomIndex = r.nextInt(chs.length);
//        利用随即索引获取对应元素
//            System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];
        }
//        System.out.println(result);

//        3.随机抽取一个数字0~9
        int number = r.nextInt(10);

//        4.生成最终的结果
        result = result + number;

        System.out.println(result);
    }
}
