package com.lury.leetcode;

import java.util.Collections;

/**
 *给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Palindrome {
    public static void main(String[] args) {
        String s = "ABC";
        int i = 12211;
        System.err.println(s.charAt(1));
        System.err.println(isPalindrome(i));
    }

    public static boolean isPalindrome(int key) {
        if (key < 0)
            return Boolean.FALSE;
        if (key < 10)
            return Boolean.TRUE;
        String originValue = String.valueOf(key);
        for (int i = 0; i < originValue.length()/2;i++) {
            char c = originValue.charAt(i);
            if(originValue.charAt(i) != originValue.charAt(originValue.length()-1-i)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
