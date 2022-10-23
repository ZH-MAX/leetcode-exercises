package pers.zh.exercise;

import java.util.Scanner;

/**
 * 数组最大值
 *  需求：
 *      设计一个方法求数组的最大值，并将最大值返回
 */

public class Method_ArrayMax {
    public static void main(String[] args) {
        System.out.println("输入五个整数：");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    
    public static int returnMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            
        }
        return max;
    }
}
