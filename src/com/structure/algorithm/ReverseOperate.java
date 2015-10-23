package com.structure.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 乔磊 on 2015/10/22.
 */
public class ReverseOperate {
    private void ReverseString(char[] s ,int from,int to){
        while (from < to){
            char t = s[from];
            s[from++] = s[to];
            s[to--] =t;
        }
    }
    private void ReverseStrings(String[] s ,int from,int to){
        while (from < to){
            String t = s[from];
            s[from++] = s[to];
            s[to--] =t;
        }
    }
    private void ReverseList(List<Integer> list,int from,int to){
        while(from < to){
            int t = list.get(from);
            list.set(from++,list.get(to));
            list.set(to--,t);
        }
    }
    private void RotateList(List<Integer> list,int n,int m){
        ReverseList(list,0,m-1);
        ReverseList(list, m, n - 1);
        System.out.println();
        for(int l:list){
            System.out.print(l);
        }
    }
    private void LeftRotateString(char[] s,int n,int m){
        //m %= n;               //若要左移动大于n位，那么和%n 是等价的
        ReverseString(s, 0, m - 1); //反转[0..m - 1]，套用到上面举的例子中，就是X->X^T，即 abc->cba
        for (char ss:s) {
            System.out.print(ss);
        }
        ReverseString(s, m, n - 1); //反转[m..n - 1]，例如Y->Y^T，即 def->fed
        System.out.println();
        for (char ss:s) {
            System.out.print(ss);
        }
        ReverseString(s, 0, n - 1); //反转[0..n - 1]，即如整个反转，(X^TY^T)^T=YX，即 cbafed->defabc。
        System.out.println();
        for (char ss:s) {
            System.out.print(ss);
        }
    }
    private void LeftRotateStrings(String[] s,int m){
        ReverseStrings(s, 0, m - 1); //反转[0..m - 1]，套用到上面举的例子中，就是X->X^T，即 abc->cba
        System.out.println();
        for (String ss:s) {
            System.out.print(ss+" ");
        }
    }
    public static void main(String args[]){
        char[] s ="abcdef".toCharArray();
        char[] s1 = "Ilovebaofeng".toCharArray();
        String[] s2 = "I am a student.".split(" ");
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        new ReverseOperate().LeftRotateString(s, 6, 3);
        new ReverseOperate().LeftRotateString(s1, 12, 5);
        new ReverseOperate().LeftRotateStrings(s2, 4);
        new ReverseOperate().RotateList(l, 6, 4);
    }
}
/**
 1、链表翻转。给出一个链表和一个数k，比如，链表为1→2→3→4→5→6，k=2，则翻转后2→1→6→5→4→3，若k=3，翻转后3→2→1→6→5→4，若k=4，翻转后4→3→2→1→6→5，用程序实现。

 2、编写程序，在原字符串中把字符串尾部的m个字符移动到字符串的头部，要求：长度为n的字符串操作时间复杂度为O(n)，空间复杂度为O(1)。 例如，原字符串为”Ilovebaofeng”，m=7，输出结果为：”baofengIlove”。

 3、单词翻转。输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变，句子中单词以空格符隔开。为简单起见，标点符号和普通字母一样处理。例如，输入“I am a student.”，则输出“student. a am I”。
 **/