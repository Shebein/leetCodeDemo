package com.lury.leetcode;


import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
//        System.err.println("ABC".charAt(0));
//        ListNode listNode = new ListNode();
//        listNode.val = 5;
//        ListNode next = new ListNode(6);
//        listNode.next = next;
//        ListNode.printListNode(listNode);
//        String s = getStringValue(listNode);
//        System.err.println(s);
        String s = "56789";
        ListNode listNode1 = formatListNode(s);
        ListNode.printListNode(listNode1);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = getStringValue(l1);
        String s2 = getStringValue(l2);
        BigDecimal b1 = BigDecimal.ZERO;
        BigDecimal b2 = BigDecimal.ZERO;
        if (!"".equals(s1))
            b1 = new BigDecimal(s1);
        if (!"".equals(s2))
            b2 = new BigDecimal(s2);
        BigDecimal add = b1.add(b2);
        String addValueStr = String.valueOf(add);
        return formatListNode(addValueStr);
    }

    public static ListNode formatListNode(String str) {
        String s = String.valueOf(str.charAt(str.length() - 1));
        ListNode firstNode = new ListNode(Integer.valueOf(String.valueOf(str.charAt(str.length() - 1))));
        ListNode cursor = firstNode;
        for (int i = str.length() - 1; i > 0; i--) {
            Integer num = Integer.valueOf(String.valueOf(str.charAt(i - 1)));
            ListNode nextNode = new ListNode(num);
            cursor.next = nextNode;
            cursor = nextNode;
        }
        return firstNode;
    }

    public static String getStringValue(ListNode node) {
        if (node == null)
            return "";
        StringBuilder ss = new StringBuilder();
        while (node != null) {
            ss.insert(0, node.val);
            node = node.next;
        }
        return ss.toString();
    }
}


//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printListNode(ListNode node) {
        while (node != null) {
            System.err.print(node.val + ";");
            node = node.next;
        }

    }
}