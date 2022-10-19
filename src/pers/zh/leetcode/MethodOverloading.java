package pers.zh.leetcode;

/**
 * 需求：
 * 使用方法重载的思想，设计比较两个整数是否相同的方法。
 * 要求：
 * 兼容全整数类型 byte、short、int、long
 */

public class MethodOverloading {
    public static void main(String[] args) {
        boolean cpr1 = compare((byte) 1, (byte) 2);
        System.out.println(cpr1);

        boolean cpr2 = compare((short) 2, (short) 2);
        System.out.println(cpr2);

        boolean cpr3 = compare(1, 2);
        System.out.println(cpr3);

        boolean cpr4 = compare(1l, 2l);
        System.out.println(cpr4);
    }

    public static boolean compare(byte b1, byte b2) {
        System.out.println("byte");
        return b1 == b2;
    }

    public static boolean compare(short s1, short s2) {
        System.out.println("short");
        return s1 == s2;
    }

    public static boolean compare(int n1, int n2) {
        System.out.println("int");
        return n1 == n2;
    }

    public static boolean compare(long l1, long l2) {
        System.out.println("long");
        return l1 == l2;
    }
}
