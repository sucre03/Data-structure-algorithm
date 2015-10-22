package com.structure.algorithm;

/**
 * Created by 乔磊 on 2015/10/22.
 */
public class ReverseStringOperate {
    private void ReverseString(char[] s ,int from,int to){
        while (from < to){
            char t = s[from];
            s[from++] = s[to];
            s[to--] =t;
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
    public static void main(String args[]){
        char[] s ="abcdef".toCharArray();
        new ReverseStringOperate().LeftRotateString(s, 6, 3);
    }
}
