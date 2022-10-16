package pers.zh.leetcode;

import java.util.Scanner;

/**
 * 判断回文数
 */
public class Palindrome {
    public static void main(String[] args) {
//        核心思路：把数字倒过来再跟原来的数比较
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        定义一个临时变量用来记录x原来的值，用于最后进行比较
        int temp = x;
//        记录倒过来之后的结果
        int num = 0;
//        利用循环开始
        while (x != 0) {
//            从右往左获取每一位数字
            int ge = x % 10;//4//3//2//1
//            修改x记录的值
            x /= 10;//x=123//x=12//x=1//0
//            把当前获取到的数字拼接到最右边
            num = num * 10 + ge;//num=4//num=43//num=432//4321
        }
        if (num == temp) {
            System.out.println(temp + "是回文数");
        } else {
            System.out.println(temp + "不是一个回文数");
        }
    }
}

