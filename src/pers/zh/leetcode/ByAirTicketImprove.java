package pers.zh.leetcode;

import java.util.Scanner;

/**
 * 自动抽取方法快捷键
 * ctrl alt M
 */
public class ByAirTicketImprove {
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
            airTicket = getAirTicket(airTicket, seat, 0.9, 0.85);

        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            //3.继续判断舱位    头等舱、经济舱
            airTicket = getAirTicket(airTicket, seat, 0.7, 0.65);
        } else {
            System.out.println("非法的月份！");
        }
//        4.计算出价格
        System.out.println("机票的价格为：" + airTicket);
    }

    private static int getAirTicket(int airTicket, int seat, double v, double v2) {
        if (seat == 0) {
            //头等舱
            airTicket *= v;
        } else if (seat == 1) {
            //经济舱
            airTicket *= v2;
        } else {
            System.out.println("非法的舱位！");
        }
        return airTicket;
    }
}
