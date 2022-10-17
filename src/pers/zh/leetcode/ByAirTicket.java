package pers.zh.leetcode;

import java.util.Scanner;

/**
 * 需求:
 * <p>
 * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
 * <p>
 * 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，
 * 淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 */
public class ByAirTicket {
    public static void main(String[] args) {
//        1.键盘录入       机票原价、月份、头等舱||经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        int airTicket = sc.nextInt();
        System.out.println("请输入当前月份：");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位：0 头等舱 1经济舱");
        int seat = sc.nextInt();
//        2.判断月份       旺季、淡季
        if (month >= 5 && month <= 10) {
            //旺季
            // 3.继续判断舱位    头等舱、经济舱
            if (seat == 0){
                //头等舱
                airTicket*=0.9;
            }else if(seat == 1){
                //经济舱
                airTicket*=0.85;
            }else {
                System.out.println("非法的舱位！");
            }

        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            //3.继续判断舱位    头等舱、经济舱
            if (seat == 0){
                //头等舱
                airTicket*=0.7;
            }else if(seat == 1){
                //经济舱
                airTicket*=0.65;
            }else {
                System.out.println("非法的舱位！");
            }
        }else {
            System.out.println("非法的月份！");
        }
//        4.计算出价格
        System.out.println("机票的价格为："+airTicket);
    }

}
