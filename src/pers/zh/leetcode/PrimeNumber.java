package pers.zh.leetcode;

/**
 * 判断101-200之间有多少个质数，并输出所有的质数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    flag = false;
                    //跳出单层循环，继续执行flag
                    break;
                }
            }
           if (flag){
               System.out.println(i+"是质数");
               count++;
           }
        }
        System.out.println(count);

    }
}
